import java.util.Scanner;
class emp{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getsalary() {
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is our custom class");

        emp blade = new emp();
        emp paradox = new emp();

        // Setting attribute for blade
        System.out.println("Enter id , name , salary for blade :");
        blade.id = sc.nextByte();
        blade.name = sc.next();
        blade.salary = sc.nextInt();

        // Setting attribute for paradox
        System.out.println("Enter id , name , salary for paradox :");
        paradox.id = sc.nextByte();
        paradox.name = sc.next();
        paradox.salary = sc.nextInt();

    }
}