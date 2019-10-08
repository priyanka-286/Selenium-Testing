package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mindcoLogin {

	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://10dem.com/login/user");
		String par1="mohinilal@dynaptsolutions.com";
		driver.findElement(By.id("emailaddress")).sendKeys(par1);
		driver.findElement(By.id("password")).sendKeys("mohini");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div[4]/button")).click();
		
		String msg=driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[2]/a/span[2]/span[1]")).getText();
		//System.out.println(msg);
			if(msg.equals(par1)){
			System.out.println("Login Successful");
		}
		else{
			System.out.println("Login Failed");
		}
			
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/a[1]")).click();
		String cnfm=driver.findElement(By.tagName("h4")).getText();
		//System.out.println(cnfm);
		if(cnfm.contains("CREATE PROJECT" )){
			System.out.println("Navigate to Create Project Successful- Passed");
		}
		else{
			System.out.println("Navigate to Create Project-Failed");
		}
		
		//Creating Project code(after reaching create project page)
		
		Select region=new Select(driver.findElement(By.id("regionproject")));
		region.selectByVisibleText("North America");
		
		Select yAgeGrp= new Select(driver.findElement(By.id("youngagegroup")));
		yAgeGrp.selectByVisibleText("20");
		
		Select oAgeGrp= new Select(driver.findElement(By.id("oldagegroup")));
		oAgeGrp.selectByVisibleText("45");
		
		Select genderProject= new Select(driver.findElement(By.id("genderofproject")));	
		genderProject.selectByVisibleText("Co-Ed");
		
		Select typeProject= new Select(driver.findElement(By.id("typeofproject")));
		typeProject.selectByVisibleText("Day & Boarding");
		
		driver.findElement(By.id("inputtitle")).sendKeys("My First Automation Project");
		String abc= driver.findElement(By.name("projecttheme")).getText();
		//Validation Required
		
		
	
	
	
	}

}
