package prob2;

import java.util.List;

public class AccountManager {
	
	public static double computeAccountBalanceSum(List<Employeee> emps) {
		double sum = 0;
		
		for(Employeee e : emps) {
			List<Account> accounts = e.getAccounts();
			for(Account acc: accounts) {
				sum+=acc.getBalance();
			}
		}
		
		return sum;
	}
}
