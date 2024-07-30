package A;

public class Item 
{	
	String title;
	String publisher;
	int publicationYear;
	Item(String title,String publisher,int publicationYear)
	{
		 this.title=title;
		this.publisher=publisher;
		this.publicationYear=publicationYear;
	}
	void displayInfo()
	{
		System.out.println("Title="+title);
		System.out.println("Publisher="+publisher);
		System.out.println("PublicationYear="+publicationYear);
	}
}

class Book extends Item 
{
		String author;
		int numberOfPages;
		
		Book(String title,String publisher,int publicationYear,String author,int numberOfPages)
		{
			super(title,publisher,publicationYear);
		
			this.author=author;
			this.numberOfPages=numberOfPages;
		}
		
		@Override
		void displayInfo()
		{
			super.displayInfo();
			
			System.out.println("Author="+author);
			System.out.println("NumberOfPages="+numberOfPages);		
			
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b=new Book("Block-Chain","KBPM Collage",2022,"Rupali",3);
		b.displayInfo();
	}
}