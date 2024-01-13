//the art and science of java chapter 6 exercise 9



public class LibraryRecord {
	
	public LibraryRecord(String title, String author, int num, String publisher, int year, boolean flag){
		bookTitle = title;
		bookAuthor = author;
		catalogNumber = num;
		publisherName = publisher;
		publicationYear = year;
		circulating = flag;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public int getCatalogNumber() {
		return catalogNumber;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setCirculating(boolean flag) {
		circulating = flag;
	}
	 
	public boolean isCirculating() {
		return circulating;
	}
	
	public String toString() {
		return "Book title: " + bookTitle + "\n" +
				"The author: " + bookAuthor + "\n" + 
				"catalog number: " + catalogNumber + "\n" + 
				"publisher's name: " + publisherName + "\n" +
				"circulating: " + (circulating? "the book is currently circulating." : "the book isn'y circulating currently.");
	}
	
	private String bookTitle;
	private String bookAuthor;
	private int catalogNumber;
	private String publisherName;
	private int publicationYear;
	private boolean circulating;
	
}

