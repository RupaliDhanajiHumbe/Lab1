package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Laptop> laptoplist=new ArrayList<>();
		laptoplist.add(new Laptop("HP",53000));
		laptoplist.add(new Laptop("Lenovo",43000));
		laptoplist.add(new Laptop("Dell",48000));
		laptoplist.add(new Laptop("mac",87000));
		
		List<Laptop> newLaptopList=laptoplist.stream()
											.filter(p->p.getPrice()>=50000 && p.getPrice()<=90000)
											.collect(Collectors.toList());
		
		newLaptopList.forEach(p->System.out.println(p.getBrand()+ " "+p.getPrice()));
	
		System.out.println();
	
		Laptop minProduct=laptoplist.stream().min((l1,l2)->l1.getPrice()>l2.getPrice()?1:-1).get();
		System.out.println(minProduct.getBrand()+ " "+minProduct.getPrice());
		System.out.println();
		
		Laptop maxProduct=laptoplist.stream().max((l1,l2)->l1.getPrice()>l2.getPrice()?1:-1).get();
		System.out.println(maxProduct.getBrand()+ " "+maxProduct.getPrice());
		System.out.println();
	}

}
class Laptop
{
	String Brand;
	int Price;
	public Laptop(String Brand, int Price) 
	{
		this.Brand=Brand;
		this.Price=Price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
}
