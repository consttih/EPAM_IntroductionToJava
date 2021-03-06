package by.jonline.pattern_matcher.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
        String str = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Vasya</to>\n" +
                "        <from>Sveta</from>\n" +
                "        <heading>Reminder</heading>\n" +
                "        <body>Call me tomorrow!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Petya</to>\n" +
                "        <from>Masha</from>\n" +
                "        <heading>Important reminder</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
		
		Pattern openTag = Pattern.compile("<\\w.+?>");
		Pattern closeTag = Pattern.compile("</\\w+>");
		Pattern contentTag = Pattern.compile(">.+?<");
		Pattern emptyTag = Pattern.compile("<\\w.+?/>");
		
		String[] lines = str.split("\n\\s+");
		StringBuilder sb = new StringBuilder();
		
		for (String line : lines) {
			
			Matcher openM = openTag.matcher(line);
			Matcher closeM = closeTag.matcher(line);
			Matcher contentM = contentTag.matcher(line);
			Matcher emptyM = emptyTag.matcher(line);
			
			if (openM.find()) {
				sb.append(openM.group());
				sb.append(" - opening tag \n");
			}
			if (closeM.find()) {
				sb.append(closeM.group());
				sb.append(" - closing tag \n");
			}
			if (contentM.find()) {
				sb.append(contentM.group());
				sb.append(" - tag content \n");
			}
			if (emptyM.find()) {
				sb.append(emptyM.group());
				sb.append(" - tag without body \n");
			}
			
		}
		
		String text = sb.toString();
		
		System.out.println(text);

	}

}
