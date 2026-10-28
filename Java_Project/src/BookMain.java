
public class BookMain {

	public static void main(String[] args) {
		
		Book bk = new Book();
		Book bk2 = new Book("A","X",100,200.5f);
		Book bk3 = new Book(500.25f,"P","Q",300);
		
		bk.setTitle("Wise and otherwise");
		bk.setAuthor("Mrs. Sudha Murthy");
		bk.setPageCount(875);
		bk.setPrice(785.25f);
		
		System.out.println(bk.getTitle());
		System.out.println(bk.getAuthor());
		System.out.println(bk.getPageCount());
		System.out.println(bk.getPrice());
		
		System.out.println("-------------------------");
		
		System.out.println(bk2.getTitle());
		System.out.println(bk2.getAuthor());
		System.out.println(bk2.getPageCount());
		System.out.println(bk2.getPrice());
		
		System.out.println("-------------------------");

		
		System.out.println(bk3.getPrice());
		System.out.println(bk3.getTitle());
		System.out.println(bk3.getAuthor());
		System.out.println(bk3.getPageCount());
	}

}
