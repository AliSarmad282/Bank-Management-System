//Ali Sarmad - 201370011 - Branch
import java.util.ArrayList;

public class Branch {
    private int brcode;
    private String city;

    ArrayList<Loan> loans = new ArrayList<Loan>();
    ArrayList<Account> accounts = new ArrayList<Account>();

    Branch() {
     
        setBrcode(0);
        setCity(null);
    
    }



    Branch(int b, String c, ArrayList<Account> accounts){
     
        setBrcode(b);
        setCity(c);
        this.accounts = accounts;
    
    }



    public void setBrcode(int brcode) {
    
        this.brcode = brcode;
    
    }//setBrcode



    public void setCity(String city) {
  
        this.city = city;
   
    }//setCity




    public int getBrcode() {

        return brcode;

    }//getBrcode



    public String getCity() {

        return city;

    }//getCity



    void displayState() {

        System.out.println("Branch Code = " + getBrcode() + "\n" +
                "City = " + getCity());

    }//displayState



    void addAccount(Account account) {

        this.accounts.add(account);

    }//addAccount



    void removeAccount(Account account) {

        this.accounts.remove(account);

    }//removeAccount



    Account getAccount(int accountNumber) {

        return this.accounts.get(accountNumber);
    
    }//getAccount



    void addLoan(Loan loan) {
    
        this.loans.add(loan);
    
    }//addLoan



    void removeLoan(Loan loan) {
     
        this.loans.add(loan);
    
    }//removeLoan



    Loan getLoan(int loanNumber) {

        return this.loans.get(loanNumber);

    }//getLoan


}//Class
