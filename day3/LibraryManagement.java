package week1.day3;

public class LibraryManagement {
	public static void main(String[] args) {
		Library act=new Library();
		String book = act.addBook("Name");
		act.issueBook();
	}

}
