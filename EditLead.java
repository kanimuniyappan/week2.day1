package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/main");
		
		Driver.findElement(By.id("username")).sendKeys("democsr");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 Driver.findElement(By.linkText("Leads")).click();
		 
		 Driver.findElement(By.linkText("Create Lead")).click();
		 
		 Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sales");
		 
		 Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kani");
		 
		 Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mozhi");
		 
		 Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kanimozhi");
		 
		 Driver.findElement(By.id("createLeadForm_description")).sendKeys("ToSalesWork");
		 
		 Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kanidivi4@gmail.com");
		 
		 WebElement state = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 
		 Select dd = new Select(state);
		 
		 dd.selectByVisibleText("New York");
		 
		 Driver.findElement(By.name("submitButton")).click();
		 
		 
		 Driver.findElement(By.className("subMenuButton")).click();
		 
		Driver.findElement(By.id("createLeadForm_description")).clear();
		 
		Driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Salesforce");
		 
		Driver.findElement(By.className("smallSubmit")).click();
		 
        String title = Driver.getTitle();
		 
		System.out.println(title);
		 
		 
		 
		 
		 

	}

}
