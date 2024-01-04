public class Account {

    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;


    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }


    public void depositMoneyBank(double depositMoney){
        this.Balance += depositMoney;
        System.out.println("Balance deposited into Account and Current balanced is :"+this.Balance);
    }


    public void withDrawMoneyBank(double withDraw){
        if(this.Balance - withDraw < 0){
            System.out.println("Unable to withdraw amount due to low balance the current balance is Rs : "+this.Balance);
        }else {

        this.Balance -= withDraw;
        System.out.println("Balance Withdraw into Account and Current balanced is :"+this.Balance);
        }

    }




    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
