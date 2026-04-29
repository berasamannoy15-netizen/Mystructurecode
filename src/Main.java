public class Main {
    public static void main(String[] args) {


        BankAccount bank = new BankAccount();
        bank.setAccountbalance(12345678);
        bank.setAccountNumber(5638362);
        bank.setCustomerName("Samannoy Bera");
        bank.setEmail("Bera @123 ");
        bank.depositFunds(3000000);
        bank.setPhoneNumber(845288);

        bank.setAccountbalance(200000000);
        bank.withdrawFunds(3400);

        bank.describeBankDetails();


    }
}