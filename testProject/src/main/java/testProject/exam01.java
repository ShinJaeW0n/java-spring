package testProject;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exam01 {

	    
	    public static void main(String[] args) {
	        
	        // 현재 package의 workspace 경로, Windows는 [ chromedriver.exe ]
	       // Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/chromedriver");  // 현재 package의
	        
	        // WebDriver 경로 설정
//	        System.setProperty("webdriver.chrome.driver", path.toString());
	    	System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver/chromedriver.exe");
	        
	        // WebDriver 옵션 설정
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");            // 전체화면으로 실행
	        options.addArguments("--disable-popup-blocking");    // 팝업 무시
	        options.addArguments("--disable-default-apps");     // 기본앱 사용안함
	        
	        // WebDriver 객체 생성
	        ChromeDriver driver = new ChromeDriver( options );
	        
	        // 빈 탭 생성
//	        driver.executeScript("window.open('about:blank','_blank');");
	        
	        // 탭 목록 가져오기
	        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        
	        
	        
	        // 첫번째 탭으로 전환
//	        driver.switchTo().window(tabs.get(0));
	        
	        // 웹페이지 요청
	        driver.get("https://www.koreabaseball.com/Record/Player/HitterBasic/Basic1.aspx");
	        
	        // 웹페이지에서 글제목 가져오기
	        List<WebElement> years = driver.findElementsByXPath("//select[@name='ctl00$ctl00$ctl00$cphContents$cphContents$cphContents$ddlSeason$ddlSeason']/option selected=\"selected\" value=\"2018\">2018</option>");
	        
	        // 웹페이지 소스 출력
	        //System.out.println( driver.getPageSource() );
	        
	        // 탭 종료
	        
	        
	        // 5초 후에 WebDriver 종료
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // WebDriver 종료
	            driver.quit();
	        }
	    }
	}


