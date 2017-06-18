public class Product {

	protected String title;
	protected Float price;

	public Product(String title, Float price) {
		this.title = title;
		this.price = price;
	}

	public static void main (String [] args) {
		Product laptop = new Product("Mac Pro", 2799.00);

		System.out.println("The price of " + laptop.title + " is " + laptop.price);
	}

    public int getTitle() {
        return title;
    }

    public int getPrice() {
        return price;

    }
}