package Casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	@Given("^user open TestMeApp$")
	public void useropenTestMeApp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("^user click signup$")
	public void userclicksignup()
	{
		driver.findElement(By.xpath("//*[@href='RegisterUser.htm']")).click();
	}
	
	@When("^user click Signin$")
	public void userclicksigin()
	{
		driver.findElement(By.xpath("//*[@href='login.htm']")).click();
	}
	@When("^user enyters credentials as$")
	public void credentials(DataTable st)
	{
		List<String> s= st.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(s.get(0));
		driver.findElement(By.name("password")).sendKeys(s.get(1));
		driver.findElement(By.name("Login")).click();
	}
	
	@When("^enter User name as \"([^\"]*)\"$")
	public void enterUsername(String s1)
	{
		driver.findElement(By.name("userName")).sendKeys(s1);
	}
	@When("^enter First Name as \"([^\"]*)\"$")
	public void enterFirstname(String s5)
	{
		driver.findElement(By.name("firstName")).sendKeys(s5);
	}
	
	@When("^enter Last Name as \"([^\"]*)\"$")
	public void enterLastName(String s2)
	{
		driver.findElement(By.name("lastName")).sendKeys(s2);
	}
	@When("^enter Password as \"([^\"]*)\"$")
	public void enterPassword(String s3)
	{
		driver.findElement(By.name("password")).sendKeys(s3);
	}
	@When("^enter Confirm Password as \"([^\"]*)\"$")
	public void enterConfirmPassword(String s4)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(s4);
	}
	@When("^enter gender as \"([^\"]*)\"$")
	public void entergender(String gender)
	{
       if(gender.equalsIgnoreCase("Female"))
       {
    	   driver.findElement(By.xpath("//input[@value='Female']")).click();
       }else if(gender.equalsIgnoreCase("Male"))
       {
    	   driver.findElement(By.xpath("//input[@value='Male']")).click();
       }
	}
	@When("^enter E-mail as \"([^\"]*)\"$")
	public void enteremail(String s6)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(s6);
	}
	@When("^enter Mobile Number as \"([^\"]*)\"$")
	public void enterMobileNumber(String s7)
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(s7);
	}
	@When("^enter DOB as \"([^\"]*)\"$")
	public void enterDOB(String s8)
	{
		driver.findElement(By.name("dob")).sendKeys(s8);
	}
	
   @When("^address as \"([^\"]*)\"$")
   public void address(String s9)
   	{
	driver.findElement(By.name("address")).sendKeys(s9);
   	}
   
   @When("^Security Question as \"([^\"]*)\"$")
   public void  SecurityQuestion(String s10)
   	{
	WebElement dropdown=driver.findElement(By.name("securityQuestion"));
	Select s=new Select(dropdown);
	s.selectByIndex(0);
   	}
   @When("^Answer as \"([^\"]*)\"$")
   public void Answer(String s11)
  	{
	driver.findElement(By.name("answer")).sendKeys(s11);
  	}
   @When("^click on Register$")
	public void clickonRegister()
	{
		driver.findElement(By.xpath("//*[@value='Register']")).click();
	}
}
