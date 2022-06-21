package assignmentJune19;

public class BookMain {

	public static void main(String[] args) {
		String author;
		String title;
		int pageCount;

		Book book1 = new Book("Paulo Coelho", "The Alchemist", 208);

		author = book1.getAuthor();
		System.out.println("Author Name : " + author);

		title = book1.getName();
		System.out.println("Title Name : " + title);

		pageCount = book1.getPages();
		System.out.println("Page Count : " + pageCount);

	}

}
