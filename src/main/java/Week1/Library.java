package Week1;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println(bookTitle + " Book added successfully");
		return(bookTitle);
		
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Library Library = new Library();
	Library.addBook("One of us is lying");
	Library.issueBook();
	
		
	}

}
