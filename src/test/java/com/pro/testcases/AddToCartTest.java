package com.pro.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.pro.pages.TestBase;
import com.pro.pages.AddToCart;
import com.pro.pages.LoginPage;

public class AddToCartTest extends TestBase {

	@Test(priority = 1)

	public void TestAddToCart() {

		extentTest.info("Browser launched");
		LoginPage logipage = PageFactory.initElements(driver, LoginPage.class);

		extentTest.info("Loged in Swaglab");

		logipage.swaglabUserPass(excel.getStringData("UserPass", 1, 0), excel.getStringData("UserPass", 1, 1));
		logipage.swaglablogin();

		extentTest.info("Browser launched");
		AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);

		extentTest.info("Loged in Swaglab");

		// System.out.println(addToCart.checkElements());
		// Assert.assertTrue(addToCart.checkElements());
		addToCart.swaglabAddCart();

		addToCart.TestCartItems();

	}
	

	

}