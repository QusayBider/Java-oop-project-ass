//Nmae:Qusay Bider                  ID:1220649          Sec:4
package proj_1220649_s4;

public class Cash extends CustomerPayment {
	private double discountRate;

	public Cash() {
		super();
		this.discountRate = 0.0;
	}

	public Cash(String customerName, int customerId, double amount, double discountRate) {
		super(customerName, customerId, amount);
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	protected double calculatePayment() {

		return ((this.amount) - ((this.discountRate / 100) * this.amount));
	}

	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ", customerName=" + customerName + ", customerId=" + customerId
				+ ", amount=" + amount + "]";
	}

}
