package pokemon.go.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import pokemon.go.db.controller.PokemonDao;
import pokemon.go.db.hibernate.model.PokemonStatic;

public class BattleUI {
	private final int BOARD_SIZE = 10;
	private final int TEAM_SIZE = 8;
	private final JPanel gui = new JPanel(new BorderLayout(3, 3));
	private JButton[][] chessBoardSquares = new JButton[BOARD_SIZE][BOARD_SIZE];
	private JPanel chessBoard;
	private final JLabel message = new JLabel("Chess Champ is ready to play!");
	private static JFrame frame;

	private List<PokemonStatic> whiteTeam = new ArrayList<>();
	private List<PokemonStatic> blackTeam = new ArrayList<>();
	private List<BufferedImage> whiteImages = new ArrayList<>();
	private List<BufferedImage> blackImages = new ArrayList<>();

	public BattleUI() throws IOException {
		initializeGui();
	}

	public final void initializeGui() throws IOException {
		// set up the main GUI
		gui.setBorder(new EmptyBorder(5, 5, 5, 5));

		setupMenuBar(gui);

		//gui.add(new JLabel("?"), BorderLayout.LINE_START);

		setupBackBoard();
		setupSquares();

		/*
		 * fill the chess board
		 */
		// add letter labels
		chessBoard.add(new JLabel(""));
		for (int col = 0; col < BOARD_SIZE; col++) {
			String letterLabel = Character.toString((char)('A'+col));
			chessBoard.add(new JLabel(letterLabel, SwingConstants.CENTER));
		}
		// fill the black non-pawn piece row
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int jj = 0; jj < BOARD_SIZE; jj++) {
				switch (jj) {
				case 0:
					//add number labels
					chessBoard.add(new JLabel("" + (BOARD_SIZE+1 - (row + 1)), SwingConstants.CENTER));
				default:
					// add actual board square
					chessBoard.add(chessBoardSquares[jj][row]);
				}
			}
		}
	}

	private void setupSquares() {
		// create the chess board squares
		Insets buttonMargin = new Insets(0, 0, 0, 0);
		for (int row = 0; row < chessBoardSquares.length; row++) {
			for (int col = 0; col < chessBoardSquares[row].length; col++) {
				JButton button = new JButton();
				button.setMargin(buttonMargin);
				// our chess pieces are 64x64 px in size, so we'll
				// 'fill this in' using a transparent icon..
				ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
				button.setIcon(icon);

				if ((col % 2 == 1 && row % 2 == 1)
						// ) {
						|| (col % 2 == 0 && row % 2 == 0)) {
					button.setBackground(Color.WHITE);
				} else {
					button.setBackground(Color.BLACK);
				}
				chessBoardSquares[col][row] = button;
			}
		}
	}

	private void setupBackBoard() {
		chessBoard = new JPanel(new GridLayout(0, BOARD_SIZE+1)) {

			/**
			 * Override the preferred size to return the largest it can, in a
			 * square shape. Must (must, must) be added to a GridBagLayout as
			 * the only component (it uses the parent as a guide to size) with
			 * no GridBagConstaint (so it is centered).
			 */
			@Override
			public final Dimension getPreferredSize() {
				Dimension d = super.getPreferredSize();
				Dimension prefSize = null;
				Component c = getParent();
				if (c == null) {
					prefSize = new Dimension((int) d.getWidth(), (int) d.getHeight());
				} else if (c != null && c.getWidth() > d.getWidth() && c.getHeight() > d.getHeight()) {
					prefSize = c.getSize();
				} else {
					prefSize = d;
				}
				int w = (int) prefSize.getWidth();
				int h = (int) prefSize.getHeight();
				// the smaller of the two sizes
				int s = (w > h ? h : w);
				return new Dimension(s, s);
			}
		};
		chessBoard.setBorder(new CompoundBorder(new EmptyBorder(BOARD_SIZE, BOARD_SIZE, BOARD_SIZE, BOARD_SIZE), new LineBorder(Color.BLACK)));
		// Set the BG to be ochre
		Color ochre = new Color(204, 119, 34);
		chessBoard.setBackground(ochre);
		JPanel boardConstrain = new JPanel(new GridBagLayout());
		boardConstrain.setBackground(ochre);
		boardConstrain.add(chessBoard);
		gui.add(boardConstrain);
	}

	private void setupMenuBar(JPanel panel) {
		JToolBar menuBar = new JToolBar();
		menuBar.setFloatable(false);
		panel.add(menuBar, BorderLayout.PAGE_START);
		Action newGameAction = new AbstractAction("New") {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					setupNewGame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		menuBar.add(newGameAction);
		menuBar.add(new JButton("Save")); // TODO - add functionality!
		menuBar.add(new JButton("Restore")); // TODO - add functionality!
		menuBar.addSeparator();
		menuBar.add(new JButton("Resign")); // TODO - add functionality!
		menuBar.addSeparator();
		menuBar.add(message);
	}

	public final JComponent getGui() {
		return gui;
	}

	/**
	 * Initializes the icons of the initial chess board piece places
	 * @throws IOException 
	 */
	private final void setupNewGame() throws IOException {
		message.setText("Make your move!");

		whiteTeam = PokemonDao.getRandomPokemons(TEAM_SIZE);
		blackTeam = PokemonDao.getRandomPokemons(TEAM_SIZE);

		createImages();

		int middleSquare = BOARD_SIZE/2;

		int i=0;
		for(int col = middleSquare - whiteTeam.size()/2; col< middleSquare+ whiteTeam.size()/2;col++){
			JButton jButton = chessBoardSquares[col][0];
			ImageIcon icon = new ImageIcon(whiteImages.get(i++));
			jButton.setIcon(icon);
		}

		int j=0;
		for(int col = middleSquare - whiteTeam.size()/2; col< middleSquare+ whiteTeam.size()/2;col++){
			JButton jButton = chessBoardSquares[col][BOARD_SIZE-1];
			ImageIcon icon = new ImageIcon(blackImages.get(j++));
			jButton.setIcon(icon);
		}

		frame.pack();
		//		for (int ii = 0; ii < BOARD_SIZE; ii++) {
		//			for (int jj = 0; jj < BOARD_SIZE; jj++) {
		//				chessBoardSquares[ii][jj].setIcon(new ImageIcon(whiteImages.get(0)));
		//			}
		//		}
		//		// set up the black pieces
		//		for (int ii = 0; ii < STARTING_ROW.length; ii++) {
		//			chessBoardSquares[ii][0].setIcon(new ImageIcon(chessPieceImages[BLACK][STARTING_ROW[ii]]));
		//		}
		//		for (int ii = 0; ii < STARTING_ROW.length; ii++) {
		//			chessBoardSquares[ii][1].setIcon(new ImageIcon(chessPieceImages[BLACK][PAWN]));
		//		}
		//		// set up the white pieces
		//		for (int ii = 0; ii < STARTING_ROW.length; ii++) {
		//			chessBoardSquares[ii][6].setIcon(new ImageIcon(chessPieceImages[WHITE][PAWN]));
		//		}
		//		for (int ii = 0; ii < STARTING_ROW.length; ii++) {
		//			chessBoardSquares[ii][7].setIcon(new ImageIcon(chessPieceImages[WHITE][STARTING_ROW[ii]]));
		//		}
	}

	private final void createImages() throws IOException {
		blackImages = bufferImages(blackTeam, true);
		whiteImages = bufferImages(whiteTeam, false);
	}

	private List<BufferedImage> bufferImages(List<PokemonStatic> team, boolean back) throws MalformedURLException, IOException {
		List<BufferedImage> images = new ArrayList<>();
		for(PokemonStatic pokemon: team){
			String pokemonSprite = null;
			for(String sprite: pokemon.getSprites()){
				if(sprite.contains("anim") && !sprite.contains("shiny")){
					if(sprite.contains("back") && back){
						pokemonSprite = sprite;
					}
					else if(!sprite.contains("back")){
						pokemonSprite = sprite;
					}
				}
			}
			System.out.println(pokemon);
			System.out.println(pokemonSprite);
			URL url = new URL(pokemonSprite);
			final HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestProperty(
					"User-Agent",
					"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
			final BufferedImage image = ImageIO.read(connection.getInputStream());
			images.add(image);
		}
		return images;
	}

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				BattleUI battleUI = null;
				try {
					battleUI = new BattleUI();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				frame = new JFrame("Pokemon Field");
				frame.add(battleUI.getGui());
				// Ensures JVM closes after frame(s) closed and
				// all non-daemon threads are finished
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				// See http://stackoverflow.com/a/7143398/418556 for demo.
				frame.setLocationByPlatform(true);

				// ensures the frame is the minimum size it needs to be
				// in order display the components within it
				frame.pack();
				// ensures the minimum size is enforced.
				frame.setMinimumSize(frame.getSize());
				frame.setVisible(true);
			}
		};
		// Swing GUIs should be created and updated on the EDT
		// http://docs.oracle.com/javase/tutorial/uiswing/concurrency
		SwingUtilities.invokeLater(r);
	}
}
