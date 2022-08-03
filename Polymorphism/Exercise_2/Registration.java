

public class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int  licenseNo;
    private long[] telephoneNo;

    public Registration(String customerName, String passportNo, long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    public Registration(String customerName, int licenseNo, String panCardNo,long[] telephoneNo){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }
    public Registration(String customerName, int voterId, int licenseNo,long[] telephoneNo){
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
    }
    public Registration(String customerName, String panCardNo, int voterId,long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public String getPanCardNo(){
        return this.panCardNo;
    }
    public int getVoidId(){
        return this.voterId;
    }
    public String getPassportNo(){
        return this.passportNo;
    }
    public int getLicenseNo(){
        return this.licenseNo;
    }
    public long[] getTelephone(){
        return this.telephoneNo;
    }


    public void Display(){
        System.out.println(String.format("Congratulations %s!!! you have been successfully registered for our services with the following details", this.customerName));
        

        //////

        if(this.panCardNo != null){
            System.out.println("Pan Card number: "+ this.getPanCardNo());
        }
        if(this.voterId != 0){
            System.out.println("Voter Id: "+ this.getVoidId());
        }
        if(this.passportNo != null){
            System.out.println("Passport number: "+ this.getPassportNo());
        }
        if(this.licenseNo != 0){
            System.out.println("License number: "+ this.getLicenseNo());
        }     
        System.out.print("Phone number: ");
        for(long l : telephoneNo) {
            System.out.println(l);
        }
    }
    
    public static void main(String[] args) {
        long[] telephoneNo1 = {9452425421L, 7676765252L};
        Registration registration1 = new Registration("Kevin", "MN9891N", telephoneNo1);
        registration1.Display();

        System.out.println();
        System.out.println();
        System.out.println();

        long[] telephoneNo2 = {2345615451L, 6763562562L};
        Registration registration2 = new Registration("Julias", 123, "PN7878", telephoneNo2);
        registration2.Display();

        System.out.println();
        System.out.println();
        System.out.println();

        long[] telephoneNo3 = {9634524353L, 9887373737L};
        Registration registration3 = new Registration("Jammay", 45453, 765, telephoneNo3);
        registration3.Display();

        System.out.println();
        System.out.println();
        System.out.println();

        long[] telephoneNo4 = {9867456367L, 7645367356L};
        Registration registration4 = new Registration("Rose", "PN8934", 765, telephoneNo4);
        registration4.Display();
    }
    
}
