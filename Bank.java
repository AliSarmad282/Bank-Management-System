//Ali Sarmad - 201370011 - Bank
import java.util.ArrayList;

public class Bank {
    private int bcode;
    private String bname;

    ArrayList<Branch> branches = new ArrayList<Branch>() ;

    Bank() {
        setBcode(0);
        setBname(null);
    }

    Bank(int c, String n, ArrayList<Branch> branches) {
        setBcode(c);
        setBname(n);
        this.branches = branches;
    }

    public void setBcode(int bcode) {
        this.bcode = bcode;
    }//setBcode

    public void setBname(String bname) {
        this.bname = bname;
    }//setBname

    public int getBcode() {
        return bcode;
    }//getBcode

    public String getBname() {
        return bname;
    }//getBname

    void displayState() {
        System.out.println(" Bank Code : " + getBcode() + "_" + " Bank Name" + getBname());
    }//displayState

    void addBranch(Branch b) {
        this.branches.add(b);        
    }//addBranch

    void removeBranch(Branch branch) {
        this.branches.remove(branch);
    }//removeBranch

    Branch getBranch(int branch_code) {
        return this.branches.get(branch_code);
    }//getBranch

    ArrayList<Branch> getAllBranches() {
        return this.branches;
    }//getAllBranches
}
