
public class BookStore {
	private static Book[] allBooks = new Book[3];
	static {
		Book firstBook = new Book();
		allBooks[0] = firstBook;
		
		allBooks[1] = new Book("Runs and Ruins" , "Sunil Gavaskar", 225, 200.45f);
		allBooks[2] = new Book(450.5f, "Rear Window" , "Hitchcock", 240);
	}
	public static Book getFirstBook() {
		return allBooks[0];
	}
	
	public static Book getLastBook() {
		int size = allBooks.length;
		int lastIndex = size -1;
		return allBooks[lastIndex];
	}
	
	public static Book getBookAt(int index) {
		int size = allBooks.length;
		int lastIndex = size -1;
		if(index < 0 || index > lastIndex)
			return null;
		return allBooks[index];
	}
}


