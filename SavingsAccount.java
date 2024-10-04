//Ali Sarmad - 201370011 - SavingsAccount
public class SavingsAccount extends Account {
    private double minimum_Balance;

    Customers customers;

    SavingsAccount() {
   
        setAccountNumbers(0);
        setBalance(0);
        setDate_of_opening(null);
        setMinimum_Balance(0);
   
    }



    SavingsAccount(int a, int b, String c, double x) {

        setAccountNumbers(a);
        setBalance(b);
        setDate_of_opening(c);
        setMinimum_Balance(x);

    }



    @Override
    public void setAccountNumbers(int accountNumber) {

        super.setAccountNumbers(accountNumber);

    }//setAccountNumbers



    @Override
    public void setBalance(double balance) {

        super.setBalance(balance);

    }//setBalance



    @Override
    public void setDate_of_opening(String date_of_opening) {

        super.setDate_of_opening(date_of_opening);

    }//setDate_of_opening



    public void setMinimum_Balance(double minimum_Balance) {

        this.minimum_Balance = minimum_Balance;

    }//setMinimum_Balance



    @Override
    public double getBalance() {

        return super.getBalance();

    }//getBalance



    @Override
    public int getAccountNumbers() {

        return super.getAccountNumbers();
 
    }//getAccount_number



    @Override
    public String getDate_of_opening() {

        return super.getDate_of_opening();

    }//getDate_of_opening



    public double getMinimum_Balance() {

        return minimum_Balance;

    }//getMinimum_Balance



    void displayState() {

        super.displayState();
        System.out.println("Minimum Balance = " + getMinimum_Balance());
    
    }//displayState

    
    
    void addCustomers(Customers customers) {
    
        this.customers = customers;
    
    }//addCustomers



    void removeCustomers(Customers customers) {

        this.customers = null;

    }//removeCustomers


}//Class
