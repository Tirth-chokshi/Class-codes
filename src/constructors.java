class Employee{
    private int e_no;
    private String e_name;

    // Case 1 : Invoke automatic if no values has been set in constructor.
    public Employee(){
        e_no = 00;
        e_name = "You-name-here";
    }

    // Case 2 : This constructor work as function.
    public Employee(String name , int no){
        e_no = no;
        e_name = name;
    }

    // Case 3 : only name constructor
    public Employee(String name ){
        e_no = 00;
        e_name = name;
    }

    // Case 4 : only number constructor
    public Employee(int no){
        e_no = no;
        e_name = "Mr.nobody";
    }

    public int getE_no() {return e_no;}
    public String getName() {return e_name;}
    public void setE_name(String n) {this.e_name = n;}
    public void setE_no(int i) {this.e_no = i;}

}

public class constructors {
    public static void main(String[] args) {

        // If Case 2 is working the value have to given here.
        // If no parameter are given then Case 1 will invoke automatic.
        // Case 3 : if you give only name that will not throw an error due to Case 3.
        // Case 4 : same as Case 3 for no.
       Employee blade = new Employee();


        System.out.println(blade.getE_no());
        System.out.println(blade.getName());
    }
}