package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	public Double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	public Double totalPrice() {
		double sum = price + customFee;
		return sum;
	}
	
	@Override
	public String toString() {
		return super.toString()
			+ " (Customs fee: $"
			+ totalPrice()
			+ ")";
	}
}
