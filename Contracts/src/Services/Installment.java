package Services;

import java.text.SimpleDateFormat;

public class Installment {

	private String dueDate;
	private Double amount;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment(String dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public String getDueDate() {
		return this.dueDate;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	@Override
	public String toString() {
		return this.getDueDate() + " - " + this.getAmount() + " ";
	}
}
