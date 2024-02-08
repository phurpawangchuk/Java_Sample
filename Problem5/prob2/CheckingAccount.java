package prob2;

public final class CheckingAccount implements Account {
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	public double getBalance() {
		return balance;
	}
}
