import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class leftnavigation{
	
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
//left navigations			
			MobileElement leftnav = (MobileElement)driver.findElementByXPath("");
			leftnav.click();
			String Account = driver.findElementByXPath("").getText();
			
			if (Account.equals("Account")){
				System.out.println("The left nav successfully");
			}
			else{
				System.out.println("not open left nav");
			}

//Profile
			MobileElement vibhor = (MobileElement)driver.findElementByXPath("");
			vibhor.click();
			String My_account = driver.findElementByXPath("").getText();
			
			if (My_account.equals("My Account")){
				System.out.println("Redirect to my account page");
			}
			else{
				System.out.println("not redirect to my account page");
			}
			
//Reditrect to SA
			MobileElement leftnav1 = (MobileElement)driver.findElementByXPath("");
			leftnav1.click();
			MobileElement SA = (MobileElement)driver.findElementByXPath("");
			SA.click();
			String Sales = driver.findElementByXPath("").getText();
			
			if (Sales.equals("Sales Analysis")){
				System.out.println("Redirected to the SA successfully");
			}
			else{
				System.out.println("not redirected to SA");
			}
			
//Redirect to AR	
			MobileElement leftnav2 = (MobileElement)driver.findElementByXPath("");
			leftnav2.click();
			MobileElement AR = (MobileElement)driver.findElementByXPath("");
			AR.click();
			String Account_rec = driver.findElementByXPath("").getText();
			
			if (Account_rec.equals("Outstanding")){
				System.out.println("Redirected to the Outstanding successfully");
			}
			else{
				System.out.println("not redirected to Outstanding");
			}
			
//Reirect open sales
			MobileElement leftnav3 = (MobileElement)driver.findElementByXPath("");
			leftnav3.click();
			MobileElement OPS = (MobileElement)driver.findElementByXPath("");
			OPS.click();
			String opshead = driver.findElementByXPath("").getText();
			
			if (opshead.equals("Sales Order")){
				System.out.println("Redirected to the Sales Order successfully");
			}
			else{
				System.out.println("not redirected to Sales Order");
			}

//Redirect to home
			MobileElement leftnav4 = (MobileElement)driver.findElementByXPath("");
			leftnav4.click();
			MobileElement home = (MobileElement)driver.findElementByXPath("");
			home.click();
			String homehead = driver.findElementByXPath("").getText();
			
			if (homehead.equals("Dahboard")){
				System.out.println("Redirected to the Dashboard successfully");
			}
			else{
				System.out.println("not redirected to Dashboard");
			}
			
//Goal
			MobileElement leftnav5 = (MobileElement)driver.findElementByXPath("");
			leftnav5.click();
			MobileElement goal = (MobileElement)driver.findElementByXPath("");
			goal.click();
			String goalhead = driver.findElementByXPath("").getText();
			
			if (goalhead.equals("Goals")){
				System.out.println("Redirected to the goal successfully");
			}
			else{
				System.out.println("not redirected to goal");
			}
			
//chat
			MobileElement leftnav6 = (MobileElement)driver.findElementByXPath("");
			leftnav6.click();
			MobileElement chat = (MobileElement)driver.findElementByXPath("");
			chat.click();
			String chathead = driver.findElementByXPath("").getText();
			
			if (chathead.equals("Chat")){
				System.out.println("Redirected to the chat successfully");
			}
			else{
				System.out.println("not redirected to chat");
			}

//Notifications
			MobileElement leftnav7 = (MobileElement)driver.findElementByXPath("");
			leftnav7.click();
			MobileElement notifications = (MobileElement)driver.findElementByXPath("");
			notifications.click();
			String notificationshead = driver.findElementByXPath("").getText();
			
			if (notificationshead.equals("Notifications")){
				System.out.println("Redirected to the notifications successfully");
			}
			else{
				System.out.println("not redirected to notifications");
			}
			
//Logout
			MobileElement leftnav8 = (MobileElement)driver.findElementByXPath("");
			leftnav8.click();
			MobileElement Logout = (MobileElement)driver.findElementByXPath("");
			Logout.click();
			String Warning = driver.findElementByXPath("").getText();
			
			if (Warning.equals("Warning")){
				System.out.println("Redirected to the Logout popup successfully");
			}
			else{
				System.out.println("not redirected to Logout");
			}
			MobileElement cross = (MobileElement)driver.findElementByXPath("");
			cross.click();
			Logout.click();
			MobileElement Logoutpopup = (MobileElement)driver.findElementByXPath("");
			Logoutpopup.click();
			
			String welcomehead = driver.findElementByXPath("").getText();
			
			if (welcomehead.equals("Welcome")){
				System.out.println("Logout successfully");
			}
			else{
				System.out.println("not Logout");
			}
			
			return;			
		}
		
	}
}

