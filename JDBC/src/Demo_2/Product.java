package Demo_2;

public class Product {

	int id;
	String name;
	int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void product(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;		
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
