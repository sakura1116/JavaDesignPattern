package iterator;

import java.util.ArrayList;
import java.util.List;

// 本棚を表現するクラス
public class BookShelf implements Aggregate {
	private List<Book> books;

	public BookShelf() {
		List<Book> books = new ArrayList<Book>();
		this.books = books;
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
