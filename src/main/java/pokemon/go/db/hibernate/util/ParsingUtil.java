package pokemon.go.db.hibernate.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class ParsingUtil {

	public static String middleString(String source, String start, String end) {
		try{
			int beginIndex = source.indexOf(start)+start.length();
			if(beginIndex == start.length()-1){
				return "";
			}
			int endIndex = source.indexOf(end, beginIndex);
			String middle = source.substring(beginIndex, endIndex);
			return middle;
		}
		catch(Exception e){
			return "";
		}
	}

	public static String getSourceAsString(String spec) throws MalformedURLException, IOException {
		URL url = new URL(spec);

		URLConnection urlConn = url.openConnection();
		urlConn.setRequestProperty("User-Agent", "cheese");

		InputStream is = urlConn.getInputStream();

		String source = IOUtils.toString(is);
		return source;
	}
	

	public static List<String> getAllStrings(String source, String pattern1, String pattern2){
		List<String> strings = new ArrayList<>();
		Pair<String, Integer> middle = new ImmutablePair<String, Integer>("", 0);
		while(middle.getRight()!=-1){
			middle = middleString(source, pattern1, pattern2, middle.getRight());
			String found = middle.getLeft();
			if(StringUtils.isNotEmpty(found)){
				strings.add(found);
			}
		}
		return strings;
	}

	public static Pair<String,Integer> middleString(String source, String start, String end, int startIndex) {
		try{
			int beginIndex = source.indexOf(start, startIndex)+start.length();
			if(beginIndex == start.length()-1){
				return new ImmutablePair<String, Integer>("", -1);
			}
			int endIndex = source.indexOf(end, beginIndex);
			String middle = source.substring(beginIndex, endIndex);
			return new ImmutablePair<String, Integer>(middle, beginIndex);
		}
		catch(Exception e){
			return new ImmutablePair<String, Integer>("", -1);
		}
	}
	
	
	


}
