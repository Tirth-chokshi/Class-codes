package LMS;

public class Member {
    private String name;
    private int phone_no;
    private String Enrollment_no;
    private String Sem;
    private int Registraion_date;
    private int expiry_date = Registraion_date+30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getEnrollment_no() {
        return Enrollment_no;
    }

    public void setEnrollment_no(String enrollment_no) {
        Enrollment_no = enrollment_no;
    }

    public String getSem() {
        return Sem;
    }

    public void setSem(String sem) {
        Sem = sem;
    }

    public int getRegistraion_date() {
        return Registraion_date;
    }

    public void setRegistraion_date(int registraion_date) {
        Registraion_date = registraion_date;
    }

//    public Member(String name, int phone_no, String enrollment_no, String sem, int registraion_date) {
//        this.name = name;
//        this.phone_no = phone_no;
//        Enrollment_no = enrollment_no;
//        Sem = sem;
//        Registraion_date = registraion_date;
//    }

    public void display(){
        System.out.println("Member name: "+name);
        System.out.println("Member Phone: "+phone_no);
        System.out.println("Member Number: "+Enrollment_no);
        System.out.println("Member Sem: "+Sem);
        System.out.println("Member Reg-date: "+Registraion_date);
        System.out.println("Member expiry: "+expiry_date);

    }
}
