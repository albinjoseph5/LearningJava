package assignmentJune19;

public class Book {
	String author;
	String title;
	int pageCount;

	public Book(String auth, String name, int pages) {
		author = auth;
		title = name;
		pageCount = pages;
	}

	String getAuthor() {
		return author;
	}

	String getName() {
		return title;
	}

	int getPages() {
		return pageCount;
	}
}
