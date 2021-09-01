package com.qa.test.AmazonTest;



	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class Amazon_test {
		WebDriver driver;
		AmazonPage Amazon_OR;
		//1.check if "books" is present in the category list
		//2.new registration
		//3.search for an item
		//4. get all item & all items to print
		//5. the footer link 
		@BeforeMethod
		@Parameters({"url"})
		public void setUp(String url)
		{
			System.setProperty("webdriver.chrome.driver","C://Users//Dell//Downloads//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
			Amazon_OR=new AmazonPage(driver);
			driver.manage().window().maximize();
			driver.get(url);
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	/*
		@Test(priority=1)
		public void categoryPresent()
		{
			Amazon_OR.getItemCollection("Books");
			Amazon_OR.getItemCollection("Electronics");
			Amazon_OR.getItemCollection("Furniture");
			
		}
	*/
		@Test(priority=1)
		@Parameters({"Category1","Bookname"})
		public void searchFirstItem(String Category1,String Bookname)
		{
			Amazon_OR.getItemCollection(Category1);

			Amazon_OR.setCategory(Category1);
		   Amazon_OR.setText(Bookname);
			Amazon_OR.magnifierClick();
			List<WebElement> books=Amazon_OR.getBookNames();
			for(WebElement item:books)
			{
				System.out.println(item);
			}
			Amazon_OR.getbookPrice();
		}
		@Test(priority=2)
		@Parameters({"Category2","Electronicsname"})
		public void searchSecondItem(String Category2,String Electronicsname)
		{
			Amazon_OR.getItemCollection(Category2);

			Amazon_OR.setCategory(Category2);
			Amazon_OR.setText(Electronicsname);
			Amazon_OR.magnifierClick();
			List<WebElement> books=Amazon_OR.getElectronicsNames();
			for(WebElement item:books)
			{
				System.out.println(item);
			}
			Amazon_OR.getPhonePrice();
		}
		@Test(priority=3)
		@Parameters({"Category3","Furniturename"})
		public void searchThirdItem(String Category3,String Furniturename)
		{
			Amazon_OR.getItemCollection(Category3);

			Amazon_OR.setCategory(Category3);
			Amazon_OR.setText(Furniturename);
			Amazon_OR.magnifierClick();
			List<WebElement> books=Amazon_OR.getWoodNames();
			for(WebElement item:books)
			{
				System.out.println(item);
			}
			Amazon_OR.getWoodPrice();
					
		}
	/*
	@Test(priority=3)
	public void getItem()
	{
		List<WebElement> books=Amazon_OR.getItemNames();
		for(WebElement item:books)
		{
			System.out.println(item);
		}
	}
	*/

	}


