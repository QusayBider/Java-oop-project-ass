//Nmae:Qusay Bider                  ID:1220649          Sec:4
package proj_1220649_s4;

public abstract class CustomerPayment implements Comparable<CustomerPayment> {
	protected String customerName;
	protected int customerId;
	protected double amount;

	public CustomerPayment() {
		this.customerName = null;
		this.customerId = 0;
		this.amount = 0.0;
	}

	public CustomerPayment(String customerName, int customerId, double amount) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CustomerPayment [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount
				+ "]";
	}

	protected abstract double calculatePayment();

	public void printPaymentInfo() {
		System.out.println(toString() + "payment = " + calculatePayment());
	}

	public int compareTo(CustomerPayment p) {
		return Double.compare(p.calculatePayment(), this.calculatePayment());

	}

}
