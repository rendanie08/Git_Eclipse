package Week1;

public class BrowserJav {
	
public static void main(String[] args)  {
		
		BrowserJav browser = new BrowserJav();
		System.out.println( browser+ " Browser launched successfully");
		browser.launchBrowser("Chrome");
		browser.loadUrl();
		 
	}	
	
	
	public String launchBrowser(String browserName) 
	{
		System.out.println( browserName+  "Browser launched successfully");
		return browserName;
	
	}
	
	public void loadUrl()        {
	System.out.println("Application url loaded successfully");
	
	}
	

}
