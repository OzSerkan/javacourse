package oopintro;

public class Product {
    
	public Product() {
		System.out.println("ben �ALI�TIM");
	}
	
	public Product(int id, String name,double unitPrice,String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
    String name;
    double unitPrice;
    String detail;
    
}
