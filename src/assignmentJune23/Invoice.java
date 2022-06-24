package assignmentJune23;

public class Invoice {
	double total = 0;
	double totalWithTax = 0;

	double calculateInvoiceTotal(Product[] product) {
		for (int i = 0; i < product.length; i++) {
			total += (product[i].pricePerunit * product[i].quantity);
		}
		return total;
	}

	// Add a method calculateTax (13%) and provide the totalAmount including Tax.
	double calculateTax() {
		double tax;
		tax = total * 0.13;
		totalWithTax = total + tax;
		return totalWithTax;
	}

}
