package B;

import java.util.*;

class Product implements Comparable<Product>
 {
	  int ProductId;
	  String ProductName;
	  int ProductPrice;
	  public Product(int Id,String Name,int Price)
	  {
	   ProductId=Id;
	   ProductName= Name;
	   ProductPrice= Price;
	  }
	  
	   public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	   public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	@Override
	   public int compareTo(Product C) 
	    {      
	       if(this.ProductPrice > C.ProductPrice)
	       {
	        return 1;
	       }
	       else if(this.ProductPrice == C.ProductPrice) 
	       {
	        return 0;
	       }
	       else
	       {
	        return -1;
	       }
    }
}

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> product= new ArrayList<>();
        product.add(new Product(101,"Phone", 20000));
        product.add(new Product(102,"Laptop", 45000));
        product.add(new Product(103,"Tab", 80000));

        Collections.sort(product);

        product.forEach(x ->System.out.println(x.getProductId()+" is name " +x.getProductName()+" is price "+x.getProductPrice()));

	}

}
