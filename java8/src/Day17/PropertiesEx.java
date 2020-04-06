package Day17;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.Scanner;


		//ex)운영서버와 테스트서버를 만들고 업뎃될때마다 수정해줘야할때 사용
public class PropertiesEx {
		public static void main(String[] args) throws Exception {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("서버를 선택하세요.");
			String server = sc.next();
			if(server.equals("main")) {
				server = "maindb";
				}else {
					server = "database";
				}
			
			sc.close(); //다시 사용할거 아니니 여기서 close
			
			Properties properties = new Properties();
			String path = PropertiesEx.class.getResource(server + ".properties").getPath();
			System.out.println(path);
			
			path = URLDecoder.decode(path,"uft-8"); //path를 utf-8로 바꿔줘라. 
			properties.load(new FileReader(path));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("username : " + username);
			System.out.println("password : " + password);
	}
}
