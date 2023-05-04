import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class signup{
	
	private static final String MyAccount = null;
	//	WebDriver driver;
	static AppiumDriver<MobileElement> driver;
	//	androidDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
	public static void openCalculator() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("AUTOMATION_NAME","Appium");
		cap.setCapability("deviceName", "vivo Y15C");
		cap.setCapability("udid", "300E6005N092902282");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability(MobileCapabilityType.NO_RESET,"True");
		cap.setCapability(MobileCapabilityType.FULL_RESET,"false");
		cap.setCapability("appPackage", "com.kockpit.kube");
		cap.setCapability("appActivity", "com.kockpit.kube.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		Thread.sleep(2000);
// Org url flow with blank valid invalid details
		Thread.sleep(7000);
		System.out.println("Work successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
// Try our demo app
		
		MobileElement Tryourdemo= (MobileElement) driver.findElementByXPath("");
		Tryourdemo.click();
		String Loginheader = driver.findElementByXPath("").getText();
		if(Loginheader.equals("")){
			System.out.println("Try our demo button working fine");
		}
		else{
			System.out.println("Have some error in the Try our demo app flow");
		}

// Signup button on login page
		MobileElement Signupbutton = (MobileElement) driver.findElementByXPath("");
		Tryourdemo.click();
		String Signupheader = driver.findElementByXPath("").getText();
		if(Signupheader.equals("")){
			System.out.println("signup button working fine");
		}
		else{
			System.out.println("Have some error in the signup flow");
		}
		
		
//Blank flow with (email without @ .com )
//Blank name 		
		MobileElement Iagree= (MobileElement) driver.findElementByXPath("");	
		Iagree.click();
		MobileElement Submit= (MobileElement) driver.findElementByXPath("");
		Submit.click();	
		String Nameblank = driver.findElementByXPath("").getText();
		if (Nameblank.equals("Name can not be empty")){
			System.out.println("The name blank flow is fine");
		}
		else{
			System.out.println("Have some error in the name blank flow");
		}
		MobileElement Name = (MobileElement) driver.findElementByXPath("");	
		Name.sendKeys("test");
		
//Blank org		
		
		Submit.click();
		String orgblank = driver.findElementByXPath("").getText();
		if (orgblank.equals("Organisation name can not be empty")){
			System.out.println("The org blank flow is fine");
		}
		else{
			System.out.println("Have some error in the org blank flow");
		}
		MobileElement org = (MobileElement) driver.findElementByXPath("");	
		org.sendKeys("test");

//Blank org email		
		Submit.click();	
		String emailblank = driver.findElementByXPath("").getText();
		if (emailblank.equals("Organisation Email can not be empty")){
			System.out.println("The Email blank flow is fine");
		}
		else{
			System.out.println("Have some error in the Email blank flow");
		}
		MobileElement email = (MobileElement) driver.findElementByXPath("");	
		email.sendKeys("test");

//Blank profession		
		Submit.click();
		String professionblank = driver.findElementByXPath("").getText();
		if (professionblank.equals("Profession can not be empty")){
			System.out.println("The name blank flow is fine");
		}
		else{
			System.out.println("Have some error in the name blank flow");
		}
		MobileElement dropdownbutton = (MobileElement) driver.findElementByXPath("");	
		dropdownbutton.click();
		MobileElement dropdownoption = (MobileElement) driver.findElementByXPath("");
		dropdownoption.click();

//Blank organisation size		
		Submit.click();
		String sizeblank = driver.findElementByXPath("").getText();
		if (sizeblank.equals("Organisation Size can not be empty")){
			System.out.println("The Organisation Size blank flow is fine");
		}
		else{
			System.out.println("Have some error in the Organisation Size blank flow");
		}
		MobileElement dropdownsize = (MobileElement) driver.findElementByXPath("");	
		dropdownsize.click();
		MobileElement dropdownoptionsize = (MobileElement) driver.findElementByXPath("");
		dropdownoptionsize.click();
						
//Invalid email		
		Submit.click();
		String Invalidemail = driver.findElementByXPath("").getText();
		if (Invalidemail.equals("Please enter your valid organization email")){
			System.out.println("The invalid email flow is fine");
		}
		else{
			System.out.println("Have some error in the invalid email flow");
		}

//with gmail
		email.sendKeys("vikas@gmail.com");
		Submit.click();
		String gmail = driver.findElementByXPath("").getText();
		if (gmail.equals("Please enter your valid organization email")){
			System.out.println("The gmail flow is fine");
		}
		else{
			System.out.println("Have some error in the gmail flow");
		}
		
// Registered user		
		email.sendKeys("vikas@kockpit.in");
		Submit.click();
		String Registered = driver.findElementByXPath("").getText();
		if (gmail.equals("Email is already in use, try")){
			System.out.println("The registered email flow is fine");
		}
		else{
			System.out.println("Have some error in the Registered email flow");
		}

// Registered user		
		email.sendKeys("point@kockpit.in");
		Submit.click();
		String Loginpage = driver.findElementByXPath("").getText();
		if (Loginpage.equals("")){
			System.out.println("Signup flow is fine");
		}
		else{
			System.out.println("Have some error in the signup flow");
		}		
	}
}

