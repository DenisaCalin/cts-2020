package ro.ase.csie.cts.g1091.seminar2;

public class Bank {
	private String name;
	private static int nextId = 0;
	
	public Bank(String name) {
		super();
		this.name = name;
	}
	
	public BankAccount openAccount(AccountTypes type) {
		
		String iban = this.name + (++nextId);
		switch(type) {
		case SAVINGS:
			return new SavingsAccount(iban);
		case CURRENT:
			return new CurrentAccount(iban);
		default:
			throw new UnsupportedOperationException();	
		}
		
	}
}
