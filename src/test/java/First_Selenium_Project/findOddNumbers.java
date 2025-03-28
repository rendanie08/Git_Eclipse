package First_Selenium_Project;

public class findOddNumbers {

	public static void main(String[] args) {
	
	int maxRange = 10;
	for(int i=1; i<=maxRange; i++) {
	if (i % 2 == 1) {
		System.out.println(i);
	}
	}
	
	System.out.println("\n");
	
	for(int i=maxRange; i>=0; i--) {
		if (i% 2 != 0) {
			System.out.println(i);
		}

}
	}
	
}
