
public class BrowserJava {

	public static void main(String[] args)  {
		
		BrowserJava browser = new BrowserJava();
		
		browser.launchBrowser("Chrome");
		browser.loadUrl();
		 
	}	
	
	
	public String launchBrowser(String browserName) 
	{
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	
	public void loadUrl()        {
	System.out.println("Application url loaded successfully");
	
	}
	
		 

}

