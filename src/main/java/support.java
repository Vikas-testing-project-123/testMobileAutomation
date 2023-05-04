import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class support{
	
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
			
//support flow 
			
//Left navigation
			MobileElement leftnavigation_button = (MobileElement)driver.findElementByXPath("");
			leftnavigation_button.click();
			
//Click setting button
			MobileElement setting = (MobileElement)driver.findElementByXPath("");
			setting.click();	
			String settingpage = driver.findElementByXPath("").getText();
			if (settingpage.equals("Settings")){
				System.out.println("Redirect to the setting page");
			}
			else{
				System.out.println("Not redirected to setting page");
			}
//Click support button
			MobileElement support = (MobileElement)driver.findElementByXPath("");
			support.click();	
			String supportpage = driver.findElementByXPath("").getText();
			if (supportpage.equals("Support")){
				System.out.println("Redirect to the support page");
			}
			else{
				System.out.println("Not redirected");
			}
			
//Click plus button
			MobileElement plus = (MobileElement)driver.findElementByXPath("");
			plus.click();
			String Newticketpage = driver.findElementByXPath("").getText();
			if (Newticketpage.equals("New Ticket")){
				System.out.println("Redirect to the new ticket page");
			}
			else{
				System.out.println("Not redirected to new ticket page");
			}
//Blank flow for add ticket flow
			MobileElement submit = (MobileElement)driver.findElementByXPath("");
			submit.click();
			String Issuetype_error = driver.findElementByXPath("").getText();
			
			if (Issuetype_error.equals("Please fill in all mandatory fields")){
				System.out.println("The blank issues type successfully");
			}
			else{
				System.out.println("Flow The blank issues type is not working properly");
			}
			
			MobileElement Issue_type = (MobileElement)driver.findElementByXPath("");
			Issue_type.click();
			MobileElement Issue_type1 = (MobileElement)driver.findElementByXPath("");
			Issue_type1.click();
			
			submit.click();
			
// Blank title
			String Issuetype_error1 = driver.findElementByXPath("").getText();
			
			if (Issuetype_error1.equals("Please fill in all mandatory fields")){
				System.out.println("The blank ticket title type successfully");
			}
			else{
				System.out.println("Flow The blank ticket title is not working properly");
			}
			
			MobileElement Tickettitle = (MobileElement)driver.findElementByXPath("");
			Tickettitle.sendKeys("test");
			submit.click();
			
//Description	
			String Issuetype_error2 = driver.findElementByXPath("").getText();
			
			if (Issuetype_error2.equals("Please fill in all mandatory fields")){
				System.out.println("The blank ticket title type successfully");
			}
			else{
				System.out.println("Flow The blank ticket title is not working properly");
			}
			
			MobileElement TicketDescription = (MobileElement)driver.findElementByXPath("");
			TicketDescription.sendKeys("testing purpose only");
			submit.click();
			
//popup check 
			String Ticketsuccess = driver.findElementByXPath("").getText();
			if (Ticketsuccess.equals("New ticket created successfully")){
				System.out.println("Ticket created successfully");
			}
			else{
				System.out.println("Ticket not created");
			}
			MobileElement okay = (MobileElement)driver.findElementByXPath("");
			okay.click();
			
			if (supportpage.equals("Support")){
				System.out.println("Redirect to the support page");
			}
			else{
				System.out.println("Not redirected");
			}
			
			return;			
		}
		
	}
}

