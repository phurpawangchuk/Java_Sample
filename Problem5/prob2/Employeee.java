package prob2;

import java.util.List;

public class Employeee {
	
	public Employeee(String id, List<Account> list) {
		this.id = id;
		this.accounts = list;
	}
	String id;
	List accounts;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
