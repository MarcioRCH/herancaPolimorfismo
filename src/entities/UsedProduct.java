package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public Date getCustomFee() {
		return manufactureDate;
	}
	public void setCustomFee(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String toString() {
		return super.toString()
			+ " (Used. Manufacture date: "
			+ sdf.format(manufactureDate)
			+ ")";
	}
}
