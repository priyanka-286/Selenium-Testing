package javapackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample {
	public static void main(String[]args) throws InterruptedException{
		
		//INSTANTIATE GOOGLE CHROME BROWSER DRIVER
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
	
		//Create chrome browser driver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://10dem.com/register/option");
		driver.findElement(By.linkText("Register")).click();
		
		
		Select student= new Select(driver.findElement(By.id("validationIns01")));
		student.selectByVisibleText("School");
		
		Select student1=new Select(driver.findElement(By.id("validationIns02")));
		student1.selectByVisibleText("India");
		
		Select student2=new Select(driver.findElement(By.id("validationIns03")));
		student2.selectByVisibleText("North America");
		 
		driver.findElement(By.name("institutionCurrentlyStudying")).sendKeys("abc");
		 Select student3=new Select(driver.findElement(By.id("validationIns05")));
		 student3.selectByVisibleText("Grade 4");
		 driver.findElement(By.id("validationIns06")).sendKeys("Technical");
		 driver.findElement(By.id("validationIns07")).sendKeys("Priya");
		 driver.findElement(By.id("validationIns08")).sendKeys("12101990");
		 driver.findElement(By.id("validationIns10")).sendKeys("kids121@abc.com");
		 

         driver.findElement(By.className("btn-cc")).click();
         driver.findElement(By.id("91")).click();
         driver.findElement(By.id("phoneNumber")).sendKeys("9999999999");
         
         Select dropDown= new Select(driver.findElement(By.xpath("//*[@id='validationIns12']")));
         dropDown.selectByValue("91");
         
         JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
         myExecutor.executeScript("document.getElementsByName('landlinenoInstitution')[0].value='7556453130'");
         
         driver.findElement(By.id("ins_email")).sendKeys("something@something.com");
         driver.findElement(By.name("build_no")).sendKeys("Park Avenue");
         driver.findElement(By.name("build_no")).sendKeys("Avenue");
         driver.findElement(By.name("street_no")).sendKeys("Park Avenue");
         driver.findElement(By.name("suburb")).sendKeys("Park Avenue");
         driver.findElement(By.name("city")).sendKeys("Avenue");
         driver.findElement(By.name("state")).sendKeys("Park Avenue");
         driver.findElement(By.name("country")).sendKeys("Park Avenue");
         driver.findElement(By.name("po_box")).sendKeys("Park Avenue");
         driver.findElement(By.name("websiteInstitution")).sendKeys("some@some.com");
         
         Select gender= new Select (driver.findElement(By.id("validationIns15")));
         gender.selectByVisibleText("Co-Ed");
         
         Select gender1= new Select (driver.findElement(By.id("validationIns16")));
         gender1.selectByVisibleText("Day");
         
         driver.findElement(By.id("validationIns17")).sendKeys("My my");
         driver.findElement(By.id("validationIns18")).sendKeys("please");
         driver.findElement(By.id("validationIns19")).sendKeys("abcdef");
         Select option = new Select(driver.findElement(By.id("validationIns20")));
         option.selectByIndex(3);
         driver.findElement(By.id("conduct")).click();
         
         driver.switchTo().defaultContent();
         driver.findElement(By.id("policy")).click();
         Thread.sleep(3000);
         driver.switchTo().defaultContent();
         Thread.sleep(2000);
         ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
         System.out.println(driver.getWindowHandles());
         //driver.switchTo().window(tabs2.get(1));
         //driver.close();
         //driver.switchTo().window(tabs2.get(2));
         //driver.close();
         driver.switchTo().window(tabs2.get(0));
        
         driver.findElement(By.className("custom-control-label")).click();
         driver.findElement(By.id("submit")).click();
         
        //String confirmMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/div/h4")).getText();
        //System.out.println(confirmMsg);
        try{ 
        if(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[2]/div/h4")).isDisplayed()==true){
        	 System.out.println("Account created successfully - Passed");
         }
        }
         catch(NoSuchElementException e1){
        	 System.out.println("Account Creation Unsuccessful- Failed");
         }
         
         driver.quit();
         
         
         
         
             
       
         
         

     
	
        		
}
}
