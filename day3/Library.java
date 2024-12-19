package week1.day3;

public class Library {
public String addBook(String addBook) {

  System.out.println("Book Added Successfully");
   return addBook;

}
protected void issueBook() {
	System.out.println("Issue Book Successfully");
}
public static void main(String[] args) {
	Library act=new Library();
	String book = act.addBook("Name");
	act.issueBook();
	
	
}
}
