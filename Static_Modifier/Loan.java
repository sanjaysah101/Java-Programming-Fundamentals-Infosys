package Static_Modifier;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter; // Default value of static is 0

    public Loan(){
        loanCounter++;
    }
    public Loan(int accountNo, int customerNo, float loanAmount, int loadDuration, float interest){
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loadDuration;
        this.interest = interest;
        loanCounter++;
    }
    int getLoan(){
        return loanNo;
    }
    void setLoanNo(int loanNo){
        this.loanNo = loanNo;
    }
    int getAccountNo(){
        return accountNo;
    }
    void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    int getCustomerNo(){
        return customerNo;
    }
    void setCustomerNo(int customerNo){
        this.customerNo = customerNo;
    }
    float getLoanAmount(){
        return loanAmount;
    }
    void setLoanAmount(float loanAmount){
        this.loanAmount = loanAmount;
    }
    int getLoanDuration(){
        return loanDuration;
    }
    void setLoanDuration(int loanDuration){
        this.loanDuration =loanDuration;
    }
    float getInterest(){
        return interest;

    }
    void setInterest(float interest){
        this.interest = interest;
    }

    public static int getLoanCounter(){
        return loanCounter;
    }
}
