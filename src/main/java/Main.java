import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {

		System.setProperty("tax.rate", "0.08");
		
		Order o = new Order();
		o.add(new Item("Café", 8.0, 2)); // 16
		o.add(new Item("Bolo", 12.5, 1)); // 12.5 -> subtotal 28.5

		TaxCalculator taxCalculator = new TaxCalculator();
		ReceiptFormatter receiptFormatter = new ReceiptFormatter();
		ReceiptService receiptService = new ReceiptService(taxCalculator, receiptFormatter);

		String receipt = receiptService.generate(o);
		System.out.println(receipt);	
	}
}
