package B;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("ready",4));
        movies.add(new Movie("Pushpa",3));
        movies.add(new Movie("Vijeta",5));
        
        Collections.sort(movies);
        movies.forEach(m->System.out.println(m.getName()+" "+m.getRatting()));   
	}
}

class Movie implements Comparable<Movie>
{
	String name;
	int ratting;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRatting() {
		return ratting;
	}
	public void setRatting(int ratting) {
		this.ratting = ratting;
	}
	
	public Movie(String name,int ratting)
	{
		super();
		this.name=name;
		this.ratting=ratting;
	}
	//@Overrride
	public int compareTo(Movie o)
	{
		if(o.getRatting()<this.getRatting())
			return 1;
		else if(o.getRatting()==this.getRatting())
			return 0;
		else
			return -1;
		
		// return this.getName().compareTo(o.getName());
	}
	
}
