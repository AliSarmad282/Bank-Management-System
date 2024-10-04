//Ali Sarmad - 201370011 - Loan
 public class Loan {
    private int loan_number;
    private double loan_amount;
    private String date_of_loan_issue;
    private int number_of_installments;
    private double amount_paid;

    Customers customers;


    Loan() {

        setLoan_number(0);
        setAmount_paid(0);
        setDateOfLoanIssue(null);
        setNumber_of_installments(0);
        setAmount_paid(0);

    }

    Loan(int loan_number, int loan_amount, String date_of_loan_issue, int number_of_installments, double amount_paid) {

        setLoan_number(loan_number);
        setAmount_paid(loan_amount);
        setDateOfLoanIssue(date_of_loan_issue);
        setNumber_of_installments(number_of_installments);
        setAmount_paid(amount_paid);

    }

    public void setAmount_paid(double amount_paid) {

        this.amount_paid = amount_paid;

    }//setAmount_paid



    public void setDateOfLoanIssue(String date_of_loan_issue) {

        this.date_of_loan_issue = date_of_loan_issue;

    }//setDateOfLoanIssue



    public void setLoan_amount(double loan_amount) {

        this.loan_amount = loan_amount;

    }//setLoan_amount



    public void setLoan_number(int loan_number) {

        this.loan_number = loan_number;

    }//setLoan_number



    public void setNumber_of_installments(int number_of_installments) {

        this.number_of_installments = number_of_installments;

    }//setNumber_of_installments



    public double getAmount_paid() {

        return amount_paid;

    }//getAmount_paid



    public double getLoan_amount() {

        return loan_amount;

    }//getLoan_amount



    public int getLoan_number() {

        return loan_number;

    }//getLoan_number



    public int getNumber_of_installments() {

        return number_of_installments;

    }//getNumber_of_installments



    public String getDateOfLoanIssue() {

        return date_of_loan_issue;

    }//getDateOfLoanIssue



    void displayState() {

        System.out.println("Loan Number : " + getLoan_number() + "_" + "Total Loan Amount :" + getLoan_amount() + "_" + "Date of loan issued : " + getDateOfLoanIssue() + "_" + "Total Number of installments : " + getNumber_of_installments() + "_" + "Total Amount Paid : " + getAmount_paid());

    }//displayState



    void updateLoanBalance() {

        setLoan_amount(getLoan_amount() - getAmount_paid());

    }//updateLoanBalance




    void addCustomer(Customers customers) {

        this.customers = customers;

    }//addCustomers



    void getLoanStatus() {

        updateLoanBalance();
        displayState();

    }//getLoanStatus




}//Class
