//Ali Sarmad - 201370011 - Account
public class Account {
    private int accountNumbers;
    private double balance;
    private String date_of_opening;

    Account() {

        setBalance(0);
        setDate_of_opening(null);
        setAccountNumbers(0);
       

    }



    Account(int a , String b , int c){

        
        setBalance(a);
        setDate_of_opening(b);
        setAccountNumbers(c);

    }



    public void setAccountNumbers(int accountNumbers){

        this.accountNumbers = accountNumbers;

    }//setAccountNumbers



    public void setBalance(double balance){

        this.balance = balance;

    }//setBalance



    public void setDate_of_opening(String date_of_opening){

        this.date_of_opening = date_of_opening;

    }//setDate_of_opening



    public double getBalance(){

        return balance;

    }//getBalance



    public int getAccountNumbers(){

        return accountNumbers;

    }//getAccountNumbers



    public String getDate_of_opening(){

        return date_of_opening;

    }//getDate_of_opening



    void displayState(){

        System.out.println("Balance : " + getBalance() + "_" + "Opening of Account ; " + getDate_of_opening() + "_" +  "Account Number : " + getAccountNumbers() );

    }//displayState



    void debitAmount(double amount){

        setBalance(this.balance - balance);

    }//debitAmount



    void creditAmount(double amount){

        setBalance(this.balance + balance);

    }//creditAmount


}//Class
