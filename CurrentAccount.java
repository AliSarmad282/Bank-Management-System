//Ali Sarmad - 201370011 - CurrentAccount
public class CurrentAccount extends Account implements TaxDeduction {
    private double interestRate;

    Customers customers;

    CurrentAccount() {
        
        setAccountNumbers(0);
        setBalance(0);
        setDate_of_opening(null);
        setInterestRate(0);
    }

    CurrentAccount(int a, int b, String c, double z) {
       
        setAccountNumbers(a);
        setBalance(b);
        setDate_of_opening(c);
        setInterestRate(z);
    }



     @Override
    public void setAccountNumbers(int accountNumbers) {

        super.setAccountNumbers(accountNumbers);

    }//setAccountNumbers



     @Override
    public void setBalance(double balance) {

        super.setBalance(balance);

    }//setBalance



    @Override
    public void setDate_of_opening(String date_of_opening) {

        super.setDate_of_opening(date_of_opening);

    }//setDate_of_opening



    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }//setInterestRate



    @Override
    public int getAccountNumbers() {
  
        return super.getAccountNumbers();
  
    }//getAccountNumbers



     @Override
    public double getBalance() {
  
        return super.getBalance();
  
    }//getBalance



    @Override
    public String getDate_of_opening() {
  
        return super.getDate_of_opening();
  
    }//getDate_of_opening



    @Override
    public double deductTax() {
  
        return ((100 - TAXRATE) * getInterestRate()) / 100;
  
    }//deductTax



    public double getInterestRate() {
  
        return interestRate;
  
    }//getInterestRate



    void displayState() {
  
        super.displayState();
        System.out.println("Interest Rate : " + getInterestRate());
  
    }//displayState



    void addCustomers(Customers customers) {
  
        this.customers = customers;
  
    }

    void removeCustomers() {
  
        this.customers = null;
  
    }


}

