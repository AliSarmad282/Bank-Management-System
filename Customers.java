//Ali Sarmad - 201370011 - Customers
public class Customers {
    private int cnumber;
    private String cname;
    private String address;
    private String phone;

    SavingsAccount savingsAccount;
    CurrentAccount currentAccount;
    Loan[] loans;

    Customers() {    
   
        setCnumber(0);
        setCname(null);
        setAddress(null);
        setPhone(null);
   
    }

 
 
    Customers(int b, String n, String a, String p) {
 
        setCnumber(b);
        setCname(n);
        setAddress(a);
        setPhone(p);
 
    }



    public void setCnumber(int cnumber) {
 
        this.cnumber = cnumber;
 
    }//setCnumber



    public void setCname(String cname) {
 
        this.cname = cname;
 
    }//setCname



    public void setAddress(String address) {
 
        this.address = address;
 
    }//setAddress



    public void setPhone(String phone) {
 
        this.phone = phone;
 
    }//setPhone



    public int getCnumber() {
 
        return cnumber;
 
    }//getCnumber



    public String getCname() {
 
        return cname;
 
    }//getCname



    public String getAddress() {
 
        return address;
 
    }//getAddress



    public String getPhone() {
 
        return phone;
 
    }//getPhone



    void displayState() {
 
        System.out.println("Customer's Name : " + getCname() + "_" + "Customer's Number : " + getCnumber() + "_" + "Customer's Address : " + getAddress() + "_" + "Customer's Phone : " + getPhone());
 
    }//displayState


}//Class
