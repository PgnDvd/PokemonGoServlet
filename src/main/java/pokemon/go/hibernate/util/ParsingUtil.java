package pokemon.go.hibernate.util;

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

}
