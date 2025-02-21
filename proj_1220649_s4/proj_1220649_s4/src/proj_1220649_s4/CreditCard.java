//Nmae:Qusay Bider                  ID:1220649          Sec:4
package proj_1220649_s4;

import java.util.*;

public class CreditCard extends CustomerPayment implements Payable {
	private double chargingFee;
	private Date expiryDate;

	public CreditCard() {
		super();
		this.chargingFee = 0.0;
		this.expiryDate = null;
	}

	public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
		super(customerName, customerId, amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}

	public double getChargingFee() {
		return chargingFee;
	}

	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	protected double calculatePayment() {

		return this.amount + this.chargingFee;
	}

	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate=" + expiryDate + ", customerName="
				+ customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}

	public boolean isAuthorized() {
		Date currentDay = new Date();
		return ((expiryDate.compareTo(currentDay)) >= 0);
	}

}
