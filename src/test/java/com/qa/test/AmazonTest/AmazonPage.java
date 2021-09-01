package com.qa.test.AmazonTest;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class AmazonPage {

		 
		private WebDriver driver;
		AmazonPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindAll(@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"))
		@CacheLookup
		List<WebElement> book_title;
		public List<WebElement> getBookNames()
		{
			return book_title;
		}
		@FindAll(@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"))
		@CacheLookup
		List<WebElement> electronics_title;
		public List<WebElement> getElectronicsNames()
		{
			return electronics_title;
		}
		@FindAll(@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"))
	    @CacheLookup
	    List<WebElement> wood_title;
		public List<WebElement> getWoodNames()
		{
			return wood_title;
		}
		
		@FindBy(id="searchDropdownBox")
		@CacheLookup
		WebElement category; 
		public boolean getItemCollection(String item)
		{
			Select select=new Select(category);
			List<WebElement> options= select.getOptions();
			
			return options.contains(item);
		}
		
		public void setCategory(String item)
		{
			Select select=new Select(category);
			select.selectByVisibleText(item);
		}
		public boolean getCategory()
		{
			return category.isSelected();
		}

		@FindBy(id="twotabsearchtextbox")
		@CacheLookup
		WebElement searchtext;
		public WebElement setText(String item)
		{
			return searchtext;
		}
	   
		@FindBy(id="nav-search-submit-button")
		@CacheLookup
		WebElement magbutton;
		public void magnifierClick() {
			magbutton.click();
			
		}
		@FindAll(@FindBy(xpath="//span[@class=\"a-letter-space\"]"))
		
		@CacheLookup
		List<WebElement> price;
		public List<WebElement> getbookPrice()
		{
			return price;
		}
		
		@FindAll(@FindBy(xpath="//span[@class=\"a-letter-space\"]"))
		@CacheLookup
		List<WebElement> woodprice;
		public List<WebElement> getWoodPrice()
		{
			return woodprice;
		}
			@FindAll(@FindBy(xpath="//span[@class=\"a-letter-space\"]"))
		@CacheLookup
		List<WebElement> phoneprice;
			public List<WebElement> getPhonePrice()
			{
				return phoneprice;
			}
		

	}



