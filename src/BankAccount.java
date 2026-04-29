public class BankAccount {
    private static double accountNumber ;
    private static double accountbalance ;
    private String customerName ;
    private String email ;
    private int phoneNumber ;
    private double balance ;

    public void depositFunds(double depositamount) {
        balance += depositamount ;
        System.out.println("Deposit of $" +depositamount + "made. New balance is $" + balance);

    }

    public static double getAccountbalance() {
        return accountbalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void withdrawFunds(double withdrawalamount) {
        if(balance -withdrawalamount < 0){
            System.out.println("Insufficient funds");
        } else {
            balance -= withdrawalamount ;
            System.out.println("withdrawal of $ " + withdrawalamount + " processed ,Remaining Balnace = $ " + balance);
        }

    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public void describeBankDetails() {
        System.out.println("Account Number :" + accountNumber + " \n" +
                "Account Balance " + accountbalance +
                "Customer Name " + customerName +
                "E-mail " + email +
                "Phone Number " + phoneNumber);
    }
}
