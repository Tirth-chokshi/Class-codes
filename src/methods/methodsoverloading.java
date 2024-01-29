package methods;

public class methodsoverloading {

    // Function 1 : This will not return any value because 'void' keyword.
    static void foo(){ System.out.println("Good morning"); }

    // Function 2 : This will take a String input and print it at calling space.
    static void foo(String a){
        System.out.println("Morning ☕" + a);
    }
    static void change(int a) {
        a= a+2;
    }
    static void change2(int [] arr) {
        arr[0] = 45;
    }
    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "plagiarism");
    }
    public static void main(String[] args) {
        tellJoke();

        int c = 2;
        change(c);
        System.out.println(c);

        //Case 1 : changing value of array
        int [] marks = {34,56,78}; // This is array object , variable name is just a reference
        System.out.println("marks elements :");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("changed value of makes:");
        change2(marks); // This will pass marks reference to change value
        System.out.println(marks[0]);

        foo();
        foo("Thomas");
    }
}
