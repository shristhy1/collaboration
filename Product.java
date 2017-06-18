public class Product {

	protected String title;
	protected Double price;

	public Product(String title, Double price) {
		this.title = title;
		this.price = price;
	}
        
        public static void printPrice(Product p){
            System.out.println("The price of " + p.title + " is " + p.price);
        }

	public static void main (String [] args) {
		Product laptop = new Product("Mac Pro", 2799.00);
                printPrice(laptop);
                
              
	}

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;

    }
}