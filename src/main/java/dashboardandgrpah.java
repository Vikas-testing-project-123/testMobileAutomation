import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class dashboardandgrpah{
	
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


		Thread.sleep(7000);
		System.out.println("Work successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
// Try our demo app
		try{
		MobileElement Tryourdemo= (MobileElement) driver.findElementByXPath("");
		Tryourdemo.click();
		MobileElement Logininput= (MobileElement) driver.findElementByXPath("");
		Logininput.sendKeys("google.play@kockpit.in");
		MobileElement Submit= (MobileElement) driver.findElementByXPath("");
		Submit.click();
		MobileElement Loginpass= (MobileElement) driver.findElementByXPath("");
		Loginpass.sendKeys("password@123");
		Submit.click();
		MobileElement policy1 =	(MobileElement)driver.findElementByXPath("");
		policy1.click();
		MobileElement policy2 =	(MobileElement)driver.findElementByXPath("");	
		policy2.click();
		MobileElement policy3 =	(MobileElement)driver.findElementByXPath("");
		policy3.click();
		MobileElement policysubmit = (MobileElement)driver.findElementByXPath("");
		policysubmit.click();
		
		String Dashboardheader = driver.findElementByXPath("").getText();
		
		if (Dashboardheader.equals("")){
			System.out.println("The User Login successfully");
		}
		else{
			System.out.println("Not login");
		}
		
		Thread.sleep(5000);
		System.out.println("Application started...");
		}
		
		catch (Exception e){
			System.out.println("Start with login");
			
//Graph footer
			
//quarter redirection			
			MobileElement quarterbutton = (MobileElement)driver.findElementByXPath("");
			quarterbutton.click();
			String quartermsg = driver.findElementByXPath("").getText();
			if (quartermsg.equals("Last 3 quarters")){
				System.out.println("Redirected to quarter");
			}
			else{
				System.out.println("Not redirected to quarter");
			}

//Month redirection			
			MobileElement Monthbutton = (MobileElement)driver.findElementByXPath("");
			Monthbutton.click();
			String Monthmsg = driver.findElementByXPath("").getText();
			if (Monthmsg.equals("Last 7 months")){
				System.out.println("Redirected to Month");
			}
			else{
				System.out.println("Not redirected to Month");
			}
			
//Month redirection			
			MobileElement daybutton = (MobileElement)driver.findElementByXPath("");
			daybutton.click();
			String daymsg = driver.findElementByXPath("").getText();
			if (daymsg.equals("Last 31 days")){
				System.out.println("Redirected to days");
			}
			else{
				System.out.println("Not redirected to days");
			}
			
//Month redirection			
			MobileElement yearbutton = (MobileElement)driver.findElementByXPath("");
			yearbutton.click();
			String yearmsg = driver.findElementByXPath("").getText();
			if (yearmsg.equals("Last 3 years")){
				System.out.println("Redirected to years");
			}
			else{
				System.out.println("Not redirected to years");
			}	

//drill down grpah
//drill down to quarter			
			MobileElement grpah21 = (MobileElement) driver.findElementByXPath(""); 
			grpah21.click();
			String q421 = driver.findElementByXPath("").getText();
			if (q421.equals("Q4,2021")){
				System.out.println("drill down to quarter correctly");
			}
			else{
				System.out.println("Not Redirected to quarter");
			}
//drill down to month		
			MobileElement q321 = (MobileElement) driver.findElementByXPath(""); 
			q321.click();
			String dec21 = driver.findElementByXPath("").getText();
			if (dec21.equals("Dec,2021")){
				System.out.println("drill down to month correctly");
			}
			else{
				System.out.println("Not Redirected to month");
			}

//drill down to days
			MobileElement nov21 = (MobileElement) driver.findElementByXPath(""); 
			nov21.click();
			String nov30 = driver.findElementByXPath("").getText();
			if (nov30.equals("30 Nov")){
				System.out.println("drill down to month correctly");
			}
			else{
				System.out.println("Not Redirected to month");
			}
			
// Redirections
			
// goal redirection
			MobileElement goalicon = (MobileElement)driver.findElementByXPath("");
			goalicon.click();
			String goalheader = driver.findElementByXPath("").getText();
			if (goalheader.equals("Goals")){
				System.out.println("Redirect to goal");
			}
			else{
				System.out.println("Not Redirected to goal");
			}
			
// Notification redirection
			MobileElement Notificationicon = (MobileElement)driver.findElementByXPath("");
			Notificationicon.click();
			String Notificationheader = driver.findElementByXPath("").getText();
			if (Notificationheader.equals("Notifications")){
			System.out.println("Redirect to Notifications");
			}
			else{
				System.out.println("Not Redirected to Notifications");
			}	
// Account redirection
			MobileElement Accounticon = (MobileElement)driver.findElementByXPath("");
			Accounticon.click();
			String Accountheader = driver.findElementByXPath("").getText();
			if (Accountheader.equals("My Account")){
				System.out.println("Redirect to Account");
			}
			else{
				System.out.println("Not Redirected to Account");
			}	

// Home redirection
			MobileElement Homeicon = (MobileElement)driver.findElementByXPath("");
			Homeicon.click();
			String Homeheader = driver.findElementByXPath("").getText();
			if (Homeheader.equals("Dashboard")){
				System.out.println("Redirect to Home");
			}
			else{
				System.out.println("Not Redirected to Home");
			}	
						
// Chat redirection
			MobileElement Chaticon = (MobileElement)driver.findElementByXPath("");
			Chaticon.click();
			String Chatheader = driver.findElementByXPath("").getText();
			if (Chatheader.equals("My Account")){
					System.out.println("Redirect to Chat");
			}
			else{
					System.out.println("Not Redirected to Chat");
			}		
			
			return;			
		}
		
	}
}

