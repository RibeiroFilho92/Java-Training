package Services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Contract {

	private Double number;
	private Date date;
	private Double totalValue;
	private Integer installments;
	List<Installment> installment = new ArrayList<Installment>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	ServicePayment service;
	
	public Contract(double number, Date date, Double totalValue, int installments, ServicePayment service) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
		this.service = service;
		this.calculatingInstallments();
	}
	
	public Double getNumber() {
		return this.number;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public Double getTotalValue() {
		return this.totalValue;
	}
	
	public Integer getInstallments() {
		return this.installments;
	}
	
	public List<Installment> getInstallment() {
		return this.installment;
	}
	
	public void calculatingInstallments() {
		Calendar dAC = new GregorianCalendar();
		dAC.setTime(this.date);
		double v = totalValue / installments;
		for (int i = 1; i <= this.installments; i++) {
			dAC.add(Calendar.DAY_OF_YEAR, 30); 
			String d = sdf.format(dAC.getTime());
			Double v1 = (v * i * service.paymentInterest(0)) + v;
			Double v2 = (v1 * service.paymentTax(0)) + v1; 
			Installment x = new Installment(d, v2);
			installment.add(x);
			System.out.print(d + " / ");
		}
	}
	
	

}
