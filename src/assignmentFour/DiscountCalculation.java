package assignmentFour;

public class DiscountCalculation {

	public static void main(String[] args) {
		String promoCode = "Promo5";
		double productPrice = 150;
		double discountedPrice;
		if (promoCode == "Promo5") {
			discountedPrice = productPrice - productPrice * (0.5 +0.05);
		} else if (promoCode == "Promo10") {
			discountedPrice = productPrice - productPrice * (0.5 + 0.1);
		} else if (promoCode == "Promo20") {
			discountedPrice = productPrice - productPrice * (0.5 + 0.2);
		} else {
			discountedPrice = productPrice - productPrice * 0.5;
		}
		System.out.println("Discounted Price for the Product is :" + discountedPrice);

	}

}
