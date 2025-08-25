package br.com.mariojp.solid.srp;

public class ReceiptFormatter {
    public String format(Order order, double subtotal, double tax, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECIBO ===\n");
        for (var i : order.getItems()) {
            sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
                    .append("\n");
        }
        sb.append("Subtotal: ").append(String.format("%.2f", subtotal)).append("\n");
        sb.append("Tax: ").append(String.format("%.2f", tax)).append("\n");
        sb.append("Total: ").append(String.format("%.2f", total)).append("\n");
        return sb.toString();
    }
}
