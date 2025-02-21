//Nmae:Qusay Bider                  ID:1220649          Sec:4
package proj_1220649_s4;

public class Check extends CustomerPayment implements Payable {
	private int accountNumber;
	private double accountBalance;
	private int type;

	public static final int CASHIER = 1;
	public static final int CERTIFIED = 2;
	public static final int PERSONAL = 3;

	public Check() {
		super();
		this.accountNumber = 0;
		this.accountBalance = 0.0;
		this.type = 0;
	}

	public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance,
			int type) {
		super(customerName, customerId, amount);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.type = type;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {

		this.accountBalance = accountBalance;

	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void deductAmountFromBalance() {
		if (type == 2 || type == 3) {
			this.setAccountBalance((this.accountBalance) - (this.amount));
		}

	}

	@Override
	protected double calculatePayment() {
		return this.amount;
	}

	@Override
	public String toString() {
		return "Check [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type
				+ ", customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}

	public boolean isAuthorized() {
		return (this.type == CASHIER || this.amount <= this.accountBalance);
	}

}
