package assignmentJune19;

public class Invoice {
	double totalAmount;

	void finalAmount(Product product, int quantity) {
		totalAmount = product.price * quantity;
		System.out.println("Total Amount : " + totalAmount);
	}
}
