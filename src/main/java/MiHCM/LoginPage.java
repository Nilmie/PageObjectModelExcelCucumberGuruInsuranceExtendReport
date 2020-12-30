package MiHCM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	 WebDriver driver;

	    
	 	By Submit = By.name("submit");
	    
	    By ClickRegisterButton = By.linkText("Register");
	    
	    By Provisional = By.id("licencetype_f");
	    
	    By Full  = By.id("licencetype_t");
	    

	    public LoginPage(WebDriver driver){
	    	this.driver = driver;

	
	    }

	    	public void ClickRegiterButtonToRegister(){

	           driver.findElement(ClickRegisterButton).click();

		    }

	    public void ClickSubmittoResister(){

           driver.findElement(Submit).click();

	    }
	    
	    
	    public void FullLicenceType(){

	           driver.findElement(Full).click();

		 }
	    
	    
	    public void ProvisionalLicenceType(){

	           driver.findElement(Provisional).click();

		 }
	 
	 
	    
//	   public void setUserDetails(String Title,String FirstName,String Surname,	String phone,String	DoBYear,String	DOBMonth, String	DOBDate,String	FullOrProvi,
	//   	String	LicencePeriod,String	Occupation, String	Street , String	City, String	Country, String	postalCode,String	email,String	password,String	confirmPassword)
	    	
	   public void setUserDetails(String Title,String FirstName,String Surname,	String phone,String	DoBYear,String	DOBMonth ,String	DOBDate,String	LicencePeriod, String	Occupation, String	Street  , String	City , String	Country , String	postalCode,String	email,String	password,String	confirmPassword)
			    	
	    	
	    	{
		   //	By TitleInsu = By.name("title");
		   
		   
		   	Select TitleInsu = new Select(driver.findElement(By.name("title")));
		    TitleInsu.selectByValue (Title); 	
		    
		   By FirstNameInsu = By.id("user_firstname");
		    driver.findElement(FirstNameInsu).sendKeys(FirstName);
		    
		    By SurnameInsu = By.id("user_surname");
		    driver.findElement(SurnameInsu).sendKeys(Surname);
		    
		    By phoneInsu = By.id("user_phone");
		    driver.findElement(phoneInsu).sendKeys(phone);
		    

		     Select DoBYearIndu = new Select(driver.findElement(By.name("year")));
		    DoBYearIndu.selectByValue (DoBYear); 
		    
		     Select DOBMonthInsu = new Select(driver.findElement(By.name("month")));
		    DOBMonthInsu.selectByValue (DOBMonth); 
		    
		    Select DOBDateInsu = new Select(driver.findElement(By.name("date")));
		    DOBDateInsu.selectByValue (DOBDate); 
		    
		 //   WebElement FullOrProviInsu = driver.findElement(By.xpath("//form[@id='new_user']/div[2]/div[4]"));	
		 //   FullOrProviInsu.click();
		    

		    
		  Select LicencePeriodInsu = new Select(driver.findElement(By.name("licenceperiod")));
		    LicencePeriodInsu.selectByValue (LicencePeriod); 
		   
		    Select OccupationInsu = new Select(driver.findElement(By.name("occupation")));
		    OccupationInsu.selectByVisibleText(Occupation); 
		    
		    By StreetInsu = By.id("user_address_attributes_street");
		    driver.findElement(StreetInsu).sendKeys(Street);
		    
		    By CityInsu = By.id("user_address_attributes_city");
		    driver.findElement(CityInsu).sendKeys(City);
		    
		     By countryInsu = By.id("user_address_attributes_county");
		    driver.findElement(countryInsu).sendKeys(Country);
		    
		    By PostalCodeInsu = By.id("user_address_attributes_postcode");
		    driver.findElement(PostalCodeInsu).sendKeys(postalCode);
		    
		    By emailInsu = By.id("user_user_detail_attributes_email");
		    driver.findElement(emailInsu).sendKeys(email);
		    
		    By passwordInsu = By.id("user_user_detail_attributes_password");
		    driver.findElement(passwordInsu).sendKeys(password);
		    
		    By confirmPasswordInsu = By.id("user_user_detail_attributes_password_confirmation");
		    driver.findElement(confirmPasswordInsu).sendKeys(confirmPassword);
	   
		    
		    
	    
	    }
	    
	    
	  // public void RegisterUser(String Title,String FirstName,String Surname,	String phone,String	DoBYear,String	DOBMonth, String	DOBDate,String	FullOrProvi,
			  // 	String	LicencePeriod,String	Occupation, String	Street , String	City, String	Country, String	postalCode,String	email,String	password,String	confirmPassword)
	   public void RegisterUser(String Title,String FirstName,String Surname,	String phone,String	DoBYear,String	DOBMonth , String	DOBDate,String	LicencePeriod, String	Occupation , String	Street, String	City , String	Country , String	postalCode,String	email,String	password,String	confirmPassword)
  	
	   {
		   this.setUserDetails(Title, FirstName,Surname,phone,DoBYear,DOBMonth,DOBDate,LicencePeriod, Occupation,Street, City , Country ,postalCode, email, password,confirmPassword);

	
	        this.ClickSubmittoResister();        
	    }


	   
	}