package com.pro.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pro.pages.TestBase;
import com.pro.pages.AddToCart;
import com.pro.pages.CheckOutComplet;
import com.pro.pages.CheckOutPageStepOne;
import com.pro.pages.CheckOutStepTwo;
import com.pro.pages.ChectOut;
import com.pro.pages.LoginPage;

public class CheckoutTest extends TestBase {

	@Test(priority=1)

	public void TestCheckOut() {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		CheckOutPageStepOne checkOutPageStepOne = PageFactory.initElements(driver, CheckOutPageStepOne.class);
		AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);
		ChectOut chectOut = PageFactory.initElements(driver, ChectOut.class);
		CheckOutComplet checkOutComplet = PageFactory.initElements(driver, CheckOutComplet.class);
		CheckOutStepTwo checkOutStepTwo = PageFactory.initElements(driver, CheckOutStepTwo.class);

		extentTest.info("Browser launched");

		extentTest.info("Loged in Swaglab");
	
			
			
			
		
		
		// Login
		loginPage.swaglabUserPass(excel.getStringData("UserPass", 1, 0), excel.getStringData("UserPass", 1, 1));
		loginPage.swaglablogin();

		// AddToCart

		addToCart.swaglabAddCart();
		chectOut.swaglabCheckoutCart();

		//checkOutPageStepOne.checkoutInformation("Nuaymah", "Rukayat", "14214");
		checkOutPageStepOne.checkoutInformation(excel.getStringData("Credentials", 1, 0), excel.getStringData("Credentials", 1, 1), excel.getStringData("Credentials", 1, 2));
		checkOutPageStepOne.clickContinue();
		checkOutStepTwo.PriceValidation();
		checkOutStepTwo.finish();
		checkOutComplet.backHome();
		// System.out.println(chectOut.checkElements());
		// Assert.assertTrue(chectOut.checkElements());
		// chectOut.swaglabAddCart();
		// chectOut.swaglabCheckoutCart();

	}
	
	@Test(priority=2)
	
	public void TestCheckOut2() {
		
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		CheckOutPageStepOne checkOutPageStepOne = PageFactory.initElements(driver, CheckOutPageStepOne.class);
		AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);
		ChectOut chectOut = PageFactory.initElements(driver, ChectOut.class);
		CheckOutComplet checkOutComplet = PageFactory.initElements(driver, CheckOutComplet.class);
		CheckOutStepTwo checkOutStepTwo = PageFactory.initElements(driver, CheckOutStepTwo.class);
		
		extentTest.info("Browser launched");
		
		extentTest.info("Loged in Swaglab");
		
		
		
		
		
		
		
		
		// AddToCart
		
		addToCart.swaglabAddCart();
		chectOut.swaglabCheckoutCart();
		
		//checkOutPageStepOne.checkoutInformation("Nuaymah", "Rukayat", "14214");
		checkOutPageStepOne.checkoutInformation(excel.getStringData("Credentials", 1, 0), excel.getStringData("Credentials", 1, 1), excel.getStringData("Credentials", 1, 2));

		checkOutPageStepOne.clickContinue();
		checkOutStepTwo.PriceValidation();
		checkOutStepTwo.finish();
		checkOutComplet.backHome();
		// System.out.println(chectOut.checkElements());
		// Assert.assertTrue(chectOut.checkElements());
		// chectOut.swaglabAddCart();
		// chectOut.swaglabCheckoutCart();
		
	}
	@Test(priority=3)
	
	public void TestCheckOut3() {
		
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		CheckOutPageStepOne checkOutPageStepOne = PageFactory.initElements(driver, CheckOutPageStepOne.class);
		AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);
		ChectOut chectOut = PageFactory.initElements(driver, ChectOut.class);
		CheckOutComplet checkOutComplet = PageFactory.initElements(driver, CheckOutComplet.class);
		CheckOutStepTwo checkOutStepTwo = PageFactory.initElements(driver, CheckOutStepTwo.class);
		
		extentTest.info("Browser launched");
		
		extentTest.info("Loged in Swaglab");
		
		
		
		
		
		
		
		
		// AddToCart
		
		addToCart.swaglabAddCart();
		chectOut.swaglabCheckoutCart();
		
		//checkOutPageStepOne.checkoutInformation("Nuaymah", "Rukayat", "14214");
		checkOutPageStepOne.checkoutInformation(excel.getStringData("Credentials", 1, 0), excel.getStringData("Credentials", 1, 1), excel.getStringData("Credentials", 1, 2));
		
		checkOutPageStepOne.clickContinue();
		checkOutStepTwo.PriceValidation();
		checkOutStepTwo.finish();
		checkOutComplet.backHome();
		// System.out.println(chectOut.checkElements());
		// Assert.assertTrue(chectOut.checkElements());
		// chectOut.swaglabAddCart();
		// chectOut.swaglabCheckoutCart();
		
	}
	

}
