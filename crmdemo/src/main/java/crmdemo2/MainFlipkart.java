package crmdemo2;

	class Flipkart {
					String productName="candles";
					String colour="blue";
					double price=100.00;
			public void searchProduct() {
										System.out.println("Searching for the product: "+productName);
										}
			public void addCart() {
									System.out.println(productName+" Added to Cart Successfully");
								  }
					}
	class OrderDetails extends Flipkart {
			public void orderDetails() {
										addCart();
										System.out.println("Order Placed Successfully "+productName);
									}
										}
			
	class DeliveryDetails extends OrderDetails {
			public void packing() {
									System.out.println(productName+" Packed Succesfully");
								   }
			public void shipping() {
									packing();
									System.out.println(productName+" Shipped Successfully");
								    }
			public void delivery() {
									shipping();
									System.out.println(productName+" Delivered Successfully");
									}
			
												}

			public class MainFlipkart{
			public static void main(String[] args) {
													DeliveryDetails ref = new DeliveryDetails();
														ref.searchProduct();
														ref.addCart();
														ref.orderDetails();
														ref.packing();
														ref.shipping();
														ref.delivery();	
													}
														}
