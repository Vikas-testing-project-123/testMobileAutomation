import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
public class SAgoal{
	
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
			MobileElement SA = (MobileElement)driver.findElementByXPath("");
			SA.click();
			
			MobileElement FooterRSM = (MobileElement)driver.findElementByXPath("");
			MobileElement Footersalesperson = (MobileElement)driver.findElementByXPath("");
			MobileElement Footercustomer = (MobileElement)driver.findElementByXPath("");
			MobileElement FooterInvoice = (MobileElement)driver.findElementByXPath("");
			MobileElement FooterBU = (MobileElement)driver.findElementByXPath("");
			
			MobileElement BUuser = (MobileElement)driver.findElementByXPath(""); 
//Long press
			AndroidTouchAction touch = new AndroidTouchAction(driver);
			LongPressOptions longpressoption = new LongPressOptions();
			longpressoption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(BUuser));
			touch.longPress(longpressoption).release().perform();
			
// Goal
			MobileElement Goal = (MobileElement)driver.findElementByXPath("");
			Goal.click();
			
//Scroll page 
			swipeScree();
			
//Blank field
			MobileElement Submit = (MobileElement)driver.findElementByXPath("");
			Submit.click();
			String errorname = driver.findElementByXPath("").getText();
			if (errorname .equals("Goal Name can't be left empty")){
				System.out.println("Blank goal name is fine");
			}
			else{
				System.out.println("Blank goal name is not fine");
			}
			MobileElement Goalname = (MobileElement)driver.findElementByXPath("");
			Goalname.sendKeys("Test");
			Submit.click();
//kpi blank 			
			String errorkpi = driver.findElementByXPath("").getText();
			if (errorkpi .equals("KPI selection can't be left empty")){
				System.out.println("Blank KPI value is fine");
			}
			else{
				System.out.println("Blank KPI value name is not fine");
			}
			MobileElement KPI = (MobileElement)driver.findElementByXPath("").click();
			MobileElement KPIselector = (MobileElement)driver.findElementByXPath("").click();
			
			Submit.click();
			
//Set target			
			String errorsettarget = driver.findElementByXPath("").getText();
			if (errorsettarget .equals("Target value can't be left empty")){
				System.out.println("Blank target value name is fine");
			}
			else{
				System.out.println("Blank target value name is not fine");
			}
			MobileElement tagget = (MobileElement)driver.findElementByXPath("").sendKeys("200000");
			Submit.click();
			
//Start date
			String errordate = driver.findElementByXPath("").getText();
			if (errordate .equals("Please select start Date")){
				System.out.println("Blank Start date value name is fine");
			}
			else{
				System.out.println("Blank Start date value name is not fine");
			}
			MobileElement calender = (MobileElement)driver.findElementByXPath("").click();
			MobileElement date = (MobileElement)driver.findElementByXPath("").click();
			Submit.click();
			
//End date
			String errorenddate = driver.findElementByXPath("").getText();
			if (errorenddate .equals("Please select End Date")){
				System.out.println("Blank end date value name is fine");
			}
			else{
				System.out.println("Blank end date value name is not fine");
			}
			MobileElement calender2 = (MobileElement)driver.findElementByXPath("").click();
			MobileElement enddate = (MobileElement)driver.findElementByXPath("").click();
			Submit.click();
						
//Description
			String errordescription = driver.findElementByXPath("").getText();
			if (errordescription .equals("Goal Description can't be left empty")){
				System.out.println("Blank description value name is fine");
			}
			else{
				System.out.println("Blank description value name is not fine");
			}
			MobileElement description = (MobileElement)driver.findElementByXPath("").sendKeys("For testing purpose only");;
			Submit.click();
			
//Success			
			String success = driver.findElementByXPath("").getText();
			if (success .equals("Success")){
				System.out.println("Goal created successfully");
			}
			else{
				System.out.println("Goal not created successfully");
			}
			MobileElement cross = (MobileElement)driver.findElementByXPath("");
			cross.click();

			
			
			
//RSM flow
			FooterRSM.click();
			
			MobileElement RSMuser = (MobileElement)driver.findElementByXPath(""); 
//Long press
			longpressoption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(RSMuser));
			touch.longPress(longpressoption).release().perform();
			
// Goal
			MobileElement GoalRSM = (MobileElement)driver.findElementByXPath("");
			Goal.click();
			
//Scroll page 
			swipeScree();
			
//Blank field
			MobileElement SubmitRSM = (MobileElement)driver.findElementByXPath("");
			Submit.click();
			String errornameRSM = driver.findElementByXPath("").getText();
			if (errornameRSM .equals("Goal Name can't be left empty")){
				System.out.println("Blank goal name is fine");
			}
			else{
				System.out.println("Blank goal name is not fine");
			}
			MobileElement GoalnameRSM = (MobileElement)driver.findElementByXPath("");
			GoalnameRSM.sendKeys("Test");
			SubmitRSM.click();
//kpi blank 			
			String errorkpiRSM = driver.findElementByXPath("").getText();
			if (errorkpiRSM .equals("KPI selection can't be left empty")){
				System.out.println("Blank KPI value is fine");
			}
			else{
				System.out.println("Blank KPI value name is not fine");
			}
			MobileElement KPIRSM = (MobileElement)driver.findElementByXPath("").click();
			MobileElement KPIselectorRSM = (MobileElement)driver.findElementByXPath("").click();
			
			SubmitRSM.click();
			
//Set target			
			String errorsettargetRSM = driver.findElementByXPath("").getText();
			if (errorsettargetRSM .equals("Target value can't be left empty")){
				System.out.println("Blank target value name is fine");
			}
			else{
				System.out.println("Blank target value name is not fine");
			}
			MobileElement taggetRSM = (MobileElement)driver.findElementByXPath("").sendKeys("200000");
			SubmitRSM.click();
			
//Start date
			String errordateRSM = driver.findElementByXPath("").getText();
			if (errordateRSM .equals("Please select start Date")){
				System.out.println("Blank Start date value name is fine");
			}
			else{
				System.out.println("Blank Start date value name is not fine");
			}
			MobileElement calenderRSM = (MobileElement)driver.findElementByXPath("").click();
			MobileElement dateRSM = (MobileElement)driver.findElementByXPath("").click();
			SubmitRSM.click();
			
//End date
			String errorenddateRSM = driver.findElementByXPath("").getText();
			if (errorenddateRSM .equals("Please select End Date")){
				System.out.println("Blank end date value name is fine");
			}
			else{
				System.out.println("Blank end date value name is not fine");
			}
			MobileElement calender2RSM = (MobileElement)driver.findElementByXPath("").click();
			MobileElement enddateRSM = (MobileElement)driver.findElementByXPath("").click();
			SubmitRSM.click();
						
//Description
			String errordescriptionRSM = driver.findElementByXPath("").getText();
			if (errordescriptionRSM .equals("Goal Description can't be left empty")){
				System.out.println("Blank description value name is fine");
			}
			else{
				System.out.println("Blank description value name is not fine");
			}
			MobileElement descriptionRSM = (MobileElement)driver.findElementByXPath("").sendKeys("For testing purpose only");;
			SubmitRSM.click();
			
//Success			
			String successRSM = driver.findElementByXPath("").getText();
			if (successRSM .equals("Success")){
				System.out.println("Goal created successfully");
			}
			else{
				System.out.println("Goal not created successfully");
			}
			MobileElement okayRSM = (MobileElement)driver.findElementByXPath("");
			okayRSM.click();
			
//Sales person flow
			Footersalesperson.click();
			
			MobileElement SPuser = (MobileElement)driver.findElementByXPath(""); 
//Long press
			longpressoption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(SPuser));
			touch.longPress(longpressoption).release().perform();
			
// Goal
			MobileElement GoalSP = (MobileElement)driver.findElementByXPath("");
			GoalSP.click();
			
//Scroll page 
			
			swipeScree();
//Blank field
			MobileElement SubmitSP = (MobileElement)driver.findElementByXPath("");
			SubmitSP.click();
			String errornameSP = driver.findElementByXPath("").getText();
			if (errornameSP .equals("Goal Name can't be left empty")){
				System.out.println("Blank goal name is fine");
			}
			else{
				System.out.println("Blank goal name is not fine");
			}
			MobileElement GoalnameSP = (MobileElement)driver.findElementByXPath("");
			GoalnameSP.sendKeys("Test");
			SubmitSP.click();
//kpi blank 			
			String errorkpiSP = driver.findElementByXPath("").getText();
			if (errorkpiSP .equals("KPI selection can't be left empty")){
				System.out.println("Blank KPI value is fine");
			}
			else{
				System.out.println("Blank KPI value name is not fine");
			}
			MobileElement KPISP = (MobileElement)driver.findElementByXPath("").click();
			MobileElement KPIselectorSP = (MobileElement)driver.findElementByXPath("").click();
			
			SubmitSP.click();
			
//Set target			
			String errorsettargetSP = driver.findElementByXPath("").getText();
			if (errorsettargetSP .equals("Target value can't be left empty")){
				System.out.println("Blank target value name is fine");
			}
			else{
				System.out.println("Blank target value name is not fine");
			}
			MobileElement taggetSP = (MobileElement)driver.findElementByXPath("").sendKeys("200000");
			SubmitSP.click();
			
//Start date
			String errordateSP = driver.findElementByXPath("").getText();
			if (errordateSP .equals("Please select start Date")){
				System.out.println("Blank Start date value name is fine");
			}
			else{
				System.out.println("Blank Start date value name is not fine");
			}
			MobileElement calenderSP = (MobileElement)driver.findElementByXPath("").click();
			MobileElement dateSP = (MobileElement)driver.findElementByXPath("").click();
			SubmitSP.click();
			
//End date
			String errorenddateSP = driver.findElementByXPath("").getText();
			if (errorenddateSP .equals("Please select End Date")){
				System.out.println("Blank end date value name is fine");
			}
			else{
				System.out.println("Blank end date value name is not fine");
			}
			MobileElement calender2SP = (MobileElement)driver.findElementByXPath("").click();
			MobileElement enddateSP = (MobileElement)driver.findElementByXPath("").click();
			SubmitSP.click();
						
//Description
			String errordescriptionSP = driver.findElementByXPath("").getText();
			if (errordescriptionSP .equals("Goal Description can't be left empty")){
				System.out.println("Blank description value name is fine");
			}
			else{
				System.out.println("Blank description value name is not fine");
			}
			MobileElement descriptionSP = (MobileElement)driver.findElementByXPath("").sendKeys("For testing purpose only");;
			SubmitSP.click();
			
//Success			
			String successSP = driver.findElementByXPath("").getText();
			if (successSP .equals("Success")){
				System.out.println("Goal created successfully");
			}
			else{
				System.out.println("Goal not created successfully");
			}
			MobileElement okaySP = (MobileElement)driver.findElementByXPath("");
			okaySP.click();
				
			
			
			
			return;			
		}
		
	}
	private static void swipeScree() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx= width/2;
		int endx= width/2;
		int starty=(int) (height*.40);
		int endy=(int) (height*.10);
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy))
		.release()
		.perform();
	}
}

