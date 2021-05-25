package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




public class Learning {
	
	
	
	
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//--driver.get("http://www.google.com");
		//driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println(title);
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("links",Keys.ENTER);
		//List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		//int count=linkslist.size();
		//System.out.println(count);
		
		
		driver.get("https://demoqa.com/");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]")).click();
		
		
		
		
		
		
		
		
		//driver.close();
		
	}

}
