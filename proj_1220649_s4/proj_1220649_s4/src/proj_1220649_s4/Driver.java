//Nmae:Qusay Bider                  ID:1220649          Sec:4
package proj_1220649_s4;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		CustomerPayment[] arrayCheck = new CustomerPayment[6];
		ArrayList<CustomerPayment> payment = new ArrayList<>();
		arrayCheck[0] = new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
		arrayCheck[1] = new Cash("Ahmad", 4444, 150, 5.0);
		arrayCheck[2] = new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
		arrayCheck[3] = new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
		arrayCheck[4] = new CreditCard("Randa", 9999, 170, 20, new Date(124, 5, 3));
		arrayCheck[5] = new CreditCard("Hani", 6666, 150, 10, new Date(120, 6, 7));
		for (int i = 0; i < arrayCheck.length; i++) {
			if (arrayCheck[i] instanceof Check) {
				if (((Check) arrayCheck[i]).isAuthorized()) {
					((Check) arrayCheck[i]).deductAmountFromBalance();
					payment.add(arrayCheck[i]);
				}
			} else if (arrayCheck[i] instanceof CreditCard) {
				if (((CreditCard) arrayCheck[i]).isAuthorized()) {
					payment.add(arrayCheck[i]);
				}
			} else
				payment.add(arrayCheck[i]);
		}
		Collections.sort(payment);

		for (CustomerPayment num : payment) {
			num.printPaymentInfo();
			System.out.println();
		}
	}
}
