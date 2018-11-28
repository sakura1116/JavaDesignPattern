package iterator;

public class Main {
	public static void main(String[] args) {

		// BookShelf bs = new BookShelf(4);
		BookShelf bs = new BookShelf();
		bs.appendBook(new Book("book A"));
		bs.appendBook(new Book("Book B"));
		bs.appendBook(new Book("Book C"));
		bs.appendBook(new Book("Book D"));
		bs.appendBook(new Book("Book F"));
		bs.appendBook(new Book("Book G"));
		Iterator it = bs.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println("" + book.getName());
		}
	}
}
