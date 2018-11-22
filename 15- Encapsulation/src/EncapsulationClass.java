
//public class EncapsulationClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Car porsche = new Car();
//		porsche.setModel("911");
//		porsche.getModel();
//		String model = porsche.getModel();
//		System.out.println(model);
  
  //  }

//}

/*
▪ Create a new class for a bank account.
▪ Create fields for the account number, balance, customer name, email and phone number. 
▪ Create getters and setters for each field.
▪ Create two additional methods:
▪ To allow the customer to deposit funds(this should increment the balance field)
▪ To allow the customer to withdraw funds. This should deduct from the balance field, 
but not allow the withdrawal to complete if there are insufficient funds.
 */


public class TaskEncapsulation {
	
	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public void deposit(double depositAmount) {
		this.accountBalance+=depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.accountBalance-withdrawalAmount<0) {
			System.out.println("Only " + this.accountBalance + " available. Withdrawal no processed");
		}else {
			this.accountBalance-=withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance= " + this.accountBalance);
		}
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return accountBalance;
	}
	public void setBalance(double balance) {
		this.accountBalance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
}

public class EncapsulationClass {

    public static void main(String[] args) {
        
        Car porsche = new Car();
        porsche.setModel("Cayenne");
        String model = porsche.getModel();
        System.out.println(model);
        
        System.out.println("-----------------");
        
        TaskEncapsulation mikeAccount = new TaskEncapsulation();
        mikeAccount.setAccountNumber("5555555");
        mikeAccount.setBalance(2.5);
        mikeAccount.setCustomerName("mike");
        
        mikeAccount.withdrawal(100.0);
        
        mikeAccount.deposit(150.000);
        mikeAccount.withdrawal(50.0);
        
        System.out.println(mikeAccount.getCustomerName());
                
    }

}


