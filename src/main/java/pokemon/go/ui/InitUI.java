package pokemon.go.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pokemon.go.db.controller.PokemonDao;

public class InitUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome");
		frame.setSize(300, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(frame, panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JFrame frame, JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(10, 40, 80, 25);
		panel.add(emailLabel);

		JTextField emailText = new JTextField(20);
		emailText.setBounds(100, 40, 160, 25);
		panel.add(emailText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 70, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 70, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 110, 80, 25);
		panel.add(loginButton);
		loginButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				boolean success = PokemonDao.registerUser(userText.getText(), emailText.getText(), String.valueOf(passwordText.getPassword()));
				if(success){
					loginButton.setEnabled(false);
					loginButton.setText("SUCCESS");
				}
				else{
					loginButton.setText("RETRY");
				}
			}
		});		

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 110, 100, 25);
		registerButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				boolean success = PokemonDao.registerUser(userText.getText(), emailText.getText(), String.valueOf(passwordText.getPassword()));
				if(success){
					registerButton.setEnabled(false);
					registerButton.setText("SUCCESS");
				}
				else{
					registerButton.setText("RETRY");
				}
			}
		});		
		panel.add(registerButton);
	}

}

