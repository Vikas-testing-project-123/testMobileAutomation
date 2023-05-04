import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class opensalesorder{
	
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
			MobileElement Opensalesorder = (MobileElement)driver.findElementByXPath("");
			Opensalesorder.click();
			MobileElement FooterRSM = (MobileElement)driver.findElementByXPath("");
			MobileElement Footersalesperson = (MobileElement)driver.findElementByXPath("");
			MobileElement Footercustomer = (MobileElement)driver.findElementByXPath("");
			MobileElement FooterOrder = (MobileElement)driver.findElementByXPath("");
			MobileElement FooterBU = (MobileElement)driver.findElementByXPath("");
			
			//RSM
			FooterRSM.click();
			Thread.sleep(10000);
			MobileElement RSMcard = (MobileElement)driver.findElementByXPath("(//android.widget.TextView[@content-desc='OpenSO-RSM RSM'])[1]");
			String RSM = RSMcard.getText();
			if (RSM .equals("RSM")){
				System.out.println("Redirected to the RSM");
			}
			else{
				System.out.println("Redirected to the RSM is not fine");
			}
			Thread.sleep(4000);
			

			//sorting
			MobileElement sort_icon1 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-RSM Sort']/android.widget.ImageView");
			sort_icon1.click();
			
			// descending flow 
			Thread.sleep(2000);
			MobileElement Desc1 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-RSM Descending']/android.view.ViewGroup");
			Desc1.click();
			Thread.sleep(2000);
			MobileElement Outsort1 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort1.click();
			Thread.sleep(2000);
			String BUsort1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-RSM Yaseer  Hossain']").getText();
			Thread.sleep(4000);
			if (BUsort1 .equals ("Yaseer  Hossain")){
				System.out.println("The descending sort is fine");
			}
			else{
				System.out.println("The descending sort is not fine");
			}
			Thread.sleep(2000);
			
			// Amount
			
			sort_icon1.click();
			Thread.sleep(3000);
			MobileElement Amount1 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-RSM Amount']");
			Amount1.click();
			Thread.sleep(4000);
			MobileElement Outsort1_1 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort1_1.click();
			Thread.sleep(5000);
			
//			String BUsortamount1_1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-RSM 10924.77']").getText();
//			Thread.sleep(2000);
//			Object BUamt1_1 = BUsortamount1_1;
//			float BUamt1_1 = Float.parseFloat(BUsortamount1_1);
//			Thread.sleep(2000);
//			String BUsortamount1_2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-RSM 7703.16']]").getText();
//			Object BUamt1_2 = BUsortamount1_2;
//			float BUamt1_2 = Float.parseFloat(BUsortamount1_2);
//			Thread.sleep(4000);
//			if (BUamt1_1 > BUamt1_2){
//				System.out.println("The descending sort is fine");
//			}
//			else{
//				System.out.println("The descending sort is not fine");
//			}
			
			
			
			
			String amtfil = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-RSM Asish Dalal']").getText();
			if (amtfil .equals("Asish Dalal")){
				System.out.println("The descending amount sort is fine");
			}
			else{
				System.out.println("The descending amount sort is not fine");
			}
			Thread.sleep(4000);
			sort_icon1.click();
			Thread.sleep(3000);
			MobileElement Ast1 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-RSM Ascending']/android.view.ViewGroup");
			Ast1.click();
			Thread.sleep(3000);
			MobileElement Name1 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-RSM Name']");
			Name1.click();
			Thread.sleep(2000);
			MobileElement Outsort1_3 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort1_3.click();
			Thread.sleep(4000);

//salesperson
			Footersalesperson.click();
			Thread.sleep(10000);
			String Salesperson = driver.findElementByXPath("(//android.widget.TextView[@content-desc='OpenSO-SalesPerson Sales Person'])[1]").getText();
			if (Salesperson .equals("Sales Person")){
				System.out.println("Redirected to the Salesperson");
			}
			else{
				System.out.println("Redirected to the Salesperson is not fine");
			}
			Thread.sleep(4000);
			
//sorting
			MobileElement sort_icon2 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-SalesPerson Sort']/android.widget.ImageView");
			sort_icon2.click();
			
// descending flow 
			Thread.sleep(3000);
			MobileElement Desc2 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-SalesPerson Descending']/android.view.ViewGroup");
			Desc2.click();
			Thread.sleep(6000);
			MobileElement Outsort2 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort2.click();
			Thread.sleep(2000);
			String BUsort2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-SalesPerson Yogesh Ramesh Prabhu ']").getText();
			Thread.sleep(4000);
			if (BUsort2 .equals ("Yogesh Ramesh Prabhu")){
				System.out.println("The descending sort is fine");
			}
			else{
				System.out.println("The descending sort is not fine");
			}
			Thread.sleep(2000);
			
			// Amount
			
			sort_icon2.click();
			Thread.sleep(2000);
			MobileElement Amount2 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-SalesPerson Amount']");
			Amount2.click();
			Thread.sleep(2000);
			MobileElement outsort2_1 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			outsort2_1.click();
			Thread.sleep(2000);
			
//			String BUsortamount2_1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-SalesPerson 4213.44']").getText();
//			int BUamt2_1 = Integer.parseInt(BUsortamount2_1);
//			String BUsortamount2_2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-SalesPerson 3858.61']").getText();
//			int BUamt2_2 = Integer.parseInt(BUsortamount2_2);
//			Thread.sleep(4000);
//			if (BUamt2_1 > BUamt2_2){
//				System.out.println("The descending sort is fine");
//			}
//			else{
//				System.out.println("The descending sort is not fine");
//			}
			
			String amtfil2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-SalesPerson Yogesh Ramesh Prabhu']").getText();
			if (amtfil2 .equals("Yogesh Ramesh Prabhu")){
				System.out.println("The descending amount sort is fine");
			}
			else{
				System.out.println("The descending amount sort is not fine");
			}
			
			Thread.sleep(4000);
//Set to default			
			sort_icon2.click();
			Thread.sleep(2000);
			MobileElement Ast2 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-SalesPerson Ascending']/android.view.ViewGroup");
			Ast2.click();
			Thread.sleep(2000);
			MobileElement Name2 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-SalesPerson Name']");
			Name2.click();
			Thread.sleep(2000);
			MobileElement Outsort2_2 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort2_2.click();
			Thread.sleep(4000);
			


//customer
			Footercustomer.click();
			Thread.sleep(10000);
			String customer = driver.findElementByXPath("(//android.widget.TextView[@content-desc='OpenSO-Customer Customer'])[1]").getText();
			System.out.println(customer);
			Thread.sleep(2000);
			if (customer .equals("Customer")){
				System.out.println("Redirected to the Customer");
			}
			else{
				System.out.println("Redirected to the Customer is not fine");
			}
			Thread.sleep(10000);
			
//			Sorting flow
			MobileElement sort_icon3 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-Customer Sort']");
			sort_icon3.click();
			
// descending flow 
			Thread.sleep(5000);
			MobileElement Desc3 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-Customer Descending']/android.view.ViewGroup");
			Desc3.click();
			Thread.sleep(5000);
			MobileElement Outsort3 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort3.click();
			Thread.sleep(5000);
			String BUsort3 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer GGOLMARK']").getText();
			Thread.sleep(5000);
			if (BUsort3 .equals ("GGOLMARK")){
				System.out.println("The descending sort is fine");
			}
			else{
				System.out.println("The descending sort is not fine");
			}
			Thread.sleep(5000);
			
			// Amount
			
			sort_icon3.click();
			Thread.sleep(10000);
			MobileElement Amount3 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-Customer Amount']");
			Amount3.click();
			Thread.sleep(2000);
			MobileElement Outsort3_1 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort3_1.click();
			Thread.sleep(5000);
			
//			String BUsortamount3_1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3740.13']").getText();
//			int BUamt3_1 = Integer.parseInt(BUsortamount3_1);
//			String BUsortamount3_2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3573.45']']").getText();
//			int BUamt3_2 = Integer.parseInt(BUsortamount3_2);
//			Thread.sleep(4000);
//			if (BUamt3_1 > BUamt3_2){
//				System.out.println("The descending sort is fine");
//			}
//			else{
//				System.out.println("The descending sort is not fine");
//			}
			
			String amtfil3 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer FIL']").getText();
			if (amtfil3 .equals("FIL")){
				System.out.println("The descending amount sort is fine");
			}
			else{
				System.out.println("The descending amount sort is not fine");
			}Thread.sleep(5000);
			sort_icon3.click();
			Thread.sleep(5000);
			
			MobileElement Ast3 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-Customer Ascending']/android.view.ViewGroup");
			Ast3.click();
			Thread.sleep(5000);
			MobileElement Name3 = (MobileElement)driver.findElementByXPath("//android.view.ViewGroup[@content-desc='OpenSO-Customer Name']");
			Name3.click();
			Thread.sleep(5000);
			MobileElement Outsort3_2 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");
			Outsort3_2.click();
			Thread.sleep(5000);
			
			
//Order
			
			FooterOrder.click();
			Thread.sleep(10000);
			String Order = driver.findElementByXPath("").getText();
			
			Thread.sleep(2000);
			if (Order .equals("")){
				System.out.println("Redirected to the Order");
			}
			else{
				System.out.println("Redirected to the Order is not fine");
			}
			Thread.sleep(10000);
			
//			Sorting flow
			MobileElement sort_icon4 = (MobileElement)driver.findElementByXPath("");
			sort_icon4.click();
			
// descending flow 
			Thread.sleep(5000);
			MobileElement Desc4 = (MobileElement)driver.findElementByXPath("");
			Desc4.click();
			Thread.sleep(5000);
			MobileElement Outsort4 = (MobileElement)driver.findElementByXPath("");
			Outsort4.click();
			Thread.sleep(5000);
			String BUsort4 = driver.findElementByXPath("").getText();
			Thread.sleep(5000);
			if (BUsort4 .equals ("GGOLMARK")){
				System.out.println("The descending sort is fine");
			}
			else{
				System.out.println("The descending sort is not fine");
			}
			Thread.sleep(5000);
			
			// Amount
			
			sort_icon4.click();
			Thread.sleep(10000);
			MobileElement Amount4 = (MobileElement)driver.findElementByXPath("");
			Amount4.click();
			Thread.sleep(2000);
			MobileElement Outsort4_1 = (MobileElement)driver.findElementByXPath("");
			Outsort4_1.click();
			Thread.sleep(5000);
			
//			String BUsortamount3_1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3740.13']").getText();
//			int BUamt3_1 = Integer.parseInt(BUsortamount3_1);
//			String BUsortamount3_2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3573.45']']").getText();
//			int BUamt3_2 = Integer.parseInt(BUsortamount3_2);
//			Thread.sleep(4000);
//			if (BUamt3_1 > BUamt3_2){
//				System.out.println("The descending sort is fine");
//			}
//			else{
//				System.out.println("The descending sort is not fine");
//			}
			
			String amtfil4= driver.findElementByXPath("").getText();
			if (amtfil4.equals("")){
				System.out.println("The descending amount sort is fine");
			}
			else{
				System.out.println("The descending amount sort is not fine");
			}Thread.sleep(5000);
			sort_icon4.click();
			Thread.sleep(5000);
			
			MobileElement Ast4 = (MobileElement)driver.findElementByXPath("");
			Ast4.click();
			Thread.sleep(5000);
			MobileElement Name4 = (MobileElement)driver.findElementByXPath("");
			Name4.click();
			Thread.sleep(5000);
			MobileElement Outsort4_2 = (MobileElement)driver.findElementByXPath("");
			Outsort4_2.click();
			Thread.sleep(5000);
			
//BU
			FooterBU.click();
			Thread.sleep(10000);
			String BU = driver.findElementByXPath("").getText();
			
			Thread.sleep(2000);
			if (BU .equals("BU")){
				System.out.println("Redirected to the BU");
			}
			else{
				System.out.println("Redirected to the BU is not fine");
			}
			Thread.sleep(10000);
			
//			Sorting flow
			MobileElement sort_icon5 = (MobileElement)driver.findElementByXPath("");
			sort_icon5.click();
			
// descending flow 
			Thread.sleep(5000);
			MobileElement Desc5 = (MobileElement)driver.findElementByXPath("");
			Desc5.click();
			Thread.sleep(5000);
			MobileElement Outsort5 = (MobileElement)driver.findElementByXPath("");
			Outsort5.click();
			Thread.sleep(5000);
			String BUsort5 = driver.findElementByXPath("").getText();
			Thread.sleep(5000);
			if (BUsort5 .equals ("")){
				System.out.println("The descending sort is fine");
			}
			else{
				System.out.println("The descending sort is not fine");
			}
			Thread.sleep(5000);
			
			// Amount
			
			sort_icon5.click();
			Thread.sleep(10000);
			MobileElement Amount5 = (MobileElement)driver.findElementByXPath("");
			Amount5.click();
			Thread.sleep(2000);
			MobileElement Outsort5_1 = (MobileElement)driver.findElementByXPath("");
			Outsort5_1.click();
			Thread.sleep(5000);
			
//			String BUsortamount3_1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3740.13']").getText();
//			int BUamt3_1 = Integer.parseInt(BUsortamount3_1);
//			String BUsortamount3_2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='OpenSO-Customer 3573.45']']").getText();
//			int BUamt3_2 = Integer.parseInt(BUsortamount3_2);
//			Thread.sleep(4000);
//			if (BUamt3_1 > BUamt3_2){
//				System.out.println("The descending sort is fine");
//			}
//			else{
//				System.out.println("The descending sort is not fine");
//			}
			
			String amtfil5= driver.findElementByXPath("").getText();
			if (amtfil5.equals("")){
				System.out.println("The descending amount sort is fine");
			}
			else{
				System.out.println("The descending amount sort is not fine");
			}Thread.sleep(5000);
			sort_icon4.click();
			Thread.sleep(5000);
			
			MobileElement Ast5 = (MobileElement)driver.findElementByXPath("");
			Ast5.click();
			Thread.sleep(5000);
			MobileElement Name5 = (MobileElement)driver.findElementByXPath("");
			Name5.click();
			Thread.sleep(5000);
			MobileElement Outsort5_2 = (MobileElement)driver.findElementByXPath("");
			Outsort5_2.click();
			Thread.sleep(5000);


			return;			
		}
		
	}
}

