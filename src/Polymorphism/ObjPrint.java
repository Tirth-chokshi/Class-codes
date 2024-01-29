package Polymorphism;

/*
                  ---------------- toString() method ----------------
By defaut everu class is extending a object class in java
below example if you run the obj variable without .num it will not print num value
we can print it without using .num
create a toString() method it will print the variable without specifing it
example is given below
run time it will decide it. that's why overriding is called as run-time polymorphism
 */
public class ObjPrint {
    int num;

    ObjPrint(int n){
        this.num = n;
    }

    @Override
    public String toString() {
        return "ObjPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjPrint obj1 = new ObjPrint(3);
        System.out.println(obj1);
    }
}
