package Application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Services.ServicePayment;
import Services.PayPal;
import Services.Contract;
import Services.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println("Enter contract data");
	System.out.print("Contract number: ");
	int number = sc.nextInt();
	sc.nextLine();
	System.out.print("Date (dd/MM/yyyy): ");
	Date date = sdf.parse(sc.nextLine());
	System.out.print("Contract value: ");
	double value = sc.nextDouble();
	System.out.print("Enter the number of installments: ");
	int installments = sc.nextInt();
	
	Contract contract = new Contract(number, date, value, installments, new PayPal());
	System.out.print(contract.getInstallment());

	sc.close();
	}
}
