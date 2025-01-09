package crmdemo2;

public class Watch {
	String brand, colour;
	int price;
	Watch(String brand)
	{
		this.brand=brand;
	}
	Watch(String brand, String colour)
	{
		this.brand = brand;
		this.colour = colour;
	}
	Watch(String brand, String colour, int price)
	{
		super();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
		public static void display(Watch w)
		{
			System.out.println("Brand name of Watch is:"+w.brand);
			System.out.println("Colour of Watch is:"+w.colour);
			System.out.println("Price of Watch is:"+w.price);
		}
		public static void main(String[] args)
		{
		Watch w1= new Watch("Rolex");
		display(w1);
		Watch w2= new Watch("Titan","Blue");
		display(w2);
		Watch w3= new Watch("Fastrack", "Silver",8000);
		display(w3);
		}
}
