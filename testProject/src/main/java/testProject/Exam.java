package testProject;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//크롤링

public class Exam {
	public static void main(String[] args) throws IOException {
		String url = "https://www.koreabaseball.com/Record/Main.aspx";
		Document doc = Jsoup.connect(url).get();
		Elements body = doc.select(".record");
		Element node = null;
		for(int i=0; i<body.size(); i++) {
			if(body.get(i).select(".title").text().equals("타율 TOP5")) {
				node = body.get(0);
			}
		}
		//String src = body.attr("src");
		Elements body2 = node.select(".rankList > li > .name > a");
		System.out.println("타율 TOP5");
		for(int i=0; i<body2.size(); i++) {
			System.out.println("순위" + (i+1) + " : " + body2.get(i).text());
		}
		try {
			Thread.sleep(1000*60*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
