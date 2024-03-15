class Stack{
    int a[];
    int top;
    Stack(int size){
    a=new int[size];
    top=-1;
    }
    void push(int n){
        if(top==a.length-1){
            System.out.print("Stack is full");
        }
        else{
            top++;
            a[top]=n;
        }
    }
    void pop(){
        if(top==-1)
            System.out.print("Stack is empty");
        else{
            int p=a[top];
            top--;
            System.out.print("Deleted: "+p);
           // return p;
        }
    }
    void display(){
       if(top==-1){
            System.out.print("Stack is empty");
        }
        else{
          for(int i=top;i>=0;i--){
              System.out.print(a[i]+" ");
          }
          System.out.println(" ");
        }
    }
    int peek(){
       int n;
       n=a[top];
       return n;
    }
    public static void main(String ar[]){
        Stack s=new Stack(4);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.print("\nTop of the list is: "+s.peek());
        s.pop();
        s.pop();
        System.out.print("After deletion the value is: ");
        s.display();
    }
}