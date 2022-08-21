package Static_Modifier.Exercise_1;
import Static_Modifier.Exercise_1.Loan;

public class LoanTester {
    public static void main(String[] args) {
        Loan l1 = new Loan();
        Loan l2 = new Loan();
        Loan l3 = new Loan(100002, 2, 100000, 2, 2.5f);
        Loan l4 = new Loan(100001, 1, 1000, 2, 2.5f);
        
        System.out.println("Loan Counter "+ Loan.getLoanCounter());
    }
}
