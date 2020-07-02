package entities;

public class Importedproduct extends Product {

	private Double customsFee;

	public Importedproduct() {
		super();
	}

	public Importedproduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return price + customsFee;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ ");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append(" (Customs fee: $ " + customsFee + ")");
		return sb.toString();
	}

}
