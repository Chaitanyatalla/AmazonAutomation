
package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
    	
    	
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(30));

        System.out.println("Title : " + driver.getTitle());
        WebElement search1=driver.findElement(By.xpath("//button[@class='a-button-text']\r\n"
				+ ""));
		search1.click();
        

        driver.findElement(By.id("nav-link-accountList")).click();

        WebElement phonenumber = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login")));
        
        phonenumber.sendKeys("0000000000");//using loggin valid phone number
        
        driver.findElement(By.id("continue")).click();

        WebElement pass = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        
        pass.sendKeys("xxxxxxxx");//using valid loggin password
        
        driver.findElement(By.id("signInSubmit")).click();

        WebElement searching = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        searching.sendKeys("Iphone x");
        searching.submit();
        Thread.sleep(2000);  
        
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
	 	scroll.executeScript("window.scrollBy(0,350)");
        driver.findElement(By.linkText("20W Charger (MFi Certified) Original Fast Adapter & Cable Compatible with iPhone "
        		+ "14/14Plus/14Pro/14Promax 13/13Pro/13Promax 12/12Pro/12/11/X/Xr Series (White)")).click();
        System.out.println("Selected Product is : 20W Charger (MFi Certified) Original Fast Adapter & Cable Compatible with iPhone \"\r\n"+ "+ \"14/14Plus/14Pro/14Promax 13/13Pro/13Promax 12/12Pro/12/11/X/Xr Series (White)");
        Thread.sleep(2000);
        
        Set<String> windowhandles = driver.getWindowHandles();
        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        driver.switchTo().window(childwindow);
        Thread.sleep(2000);
        
        WebElement buy =  driver.findElement(By.xpath("//*[@class='a-button a-button-oneclick a-button-icon onml-buy-now-button']"));
        buy.click();
       
        WebElement upiOption = waiting.until(ExpectedConditions.elementToBeClickable(By.id("pagelet-layout-section")));
    	upiOption.click();
    		
    	JavascriptExecutor scrollupi = (JavascriptExecutor) driver;
    	scrollupi.executeScript("window.scrollBy(0,300)");
    	driver.findElement(By.xpath("//span[contains(text(),'Other UPI Apps')]")).click();
    		

    	System.out.println("choosing the UPI payment Method ");
    	Thread.sleep(2000);
    		
    	WebElement otherUpiOption1 = driver.findElement(By.name("__sif_encryptedVPA_collect"));
    	otherUpiOption1.sendKeys("avinash@ybl");
    	System.out.println("UPI ID enter sucessfully");
    	Thread.sleep(2000);
    		
    		
    	WebElement verifyBtn = waiting.until(ExpectedConditions.elementToBeClickable(
    	By.xpath("//input[@name='ppw-widgetEvent:ValidateUpiIdEvent'] | //span[text()='Verify']")));
    	verifyBtn.click();
    	System.out.println("verified Sucessfully");
    	Thread.sleep(3000);
    		
    	JavascriptExecutor scrollcontinue = (JavascriptExecutor) driver;
   		scrollcontinue.executeScript("window.scrollBy(0,300)");
   	    driver.findElement(By.xpath("//input[@data-testid='bottom-continue-button']")).click();
      	Thread.sleep(5000);
      	driver.quit();

      	
      	
            }
}
