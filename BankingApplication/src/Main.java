public class Main {
    public static void main(String[] args) {

       Account abhishek = new Account("1233", 0.0, "Patel" , "aphait321@gmail.com", "1234568" );

       abhishek.getBalance();
       abhishek.depositMoneyBank(1000.00);
       abhishek.withDrawMoneyBank(500);
       abhishek.withDrawMoneyBank(6000);
       abhishek.getBalance();




    }
}