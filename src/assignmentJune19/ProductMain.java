package assignmentJune19;

public class ProductMain {

	public static void main(String[] args) {
		Product pen = new Product("Parker", 10, "Ink Pen");
		Product pencil = new Product("Camel", 2, "Dark");
		Product eraser = new Product("Faber Castell", 1, "Non Dust");
		Product sharpener = new Product("Faber Castell", 2, "Sharp");
		Product ruler = new Product("Staples", 3, "Acrylic");
		Product stapler = new Product("Mastercraft", 12, "Easy Grip");
		Product marker = new Product("Sharp", 5, "Permanent");
		Product crayons = new Product("Crayola", 11, "Assorted Colors");
		Product notebook = new Product("Classmates", 5, "Ruled");
		Product binder = new Product("Five Star", 7, "Hybrid Note Binder");

		Invoice invoice1 = new Invoice();
		invoice1.finalAmount(binder, 3);
	}

}
