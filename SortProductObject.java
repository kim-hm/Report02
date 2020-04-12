import java.util.Arrays;

public class SortProductObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] product = new Product[3];
		
		product[0] = new Product("A", 11);
		product[1] = new Product("Z", 13);
		product[2] = new Product("X", 10);
		
		System.out.println("[compareTo sort productNum]");
		Arrays.sort(product);
		printProduct(product);
		
		System.out.println("[compareTo sort productName]");
		Arrays.sort(product, new ProductNameComparator());
		printProduct(product);
	}
	
	public static void printProduct(Product[] product) 
	{
		for(Product product1: product)
			System.out.println(product1);
	}
}
