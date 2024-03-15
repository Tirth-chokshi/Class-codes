import java.io.*;
import java.util.*;

public class Queue2{
static final int size=100;
int[] item=new int[size];
public static void main(String args[])
{
    Queue2 q1=new Queue2();
        int opt, val;
         do{
            System.out.println("1.Enqueue 2. Dequeue 3. Display 4. EXIT");
      //  System.out.println(" ");
        //System.out.println("  ");
       // System.out.println(" ");
        System.out.println("\n Enter Your Option: ");
        Scanner s=new Scanner(System.in);
        opt=s.nextInt();
   
        switch(opt)
        {
            case 1: 
                    q1.enqueue(s);
                    break;

            case 2: q1.dequeue();
                    break;
                
            case 3: q1.display();
                    break; 

        }
    }while(opt!=4);

}
int f=-1,r=-1;
public void enqueue(Scanner s)
{
    if(r==(size-1))
            System.out.println("Overflow Queue");
        else{ 
            System.out.print("Enter data ");
            int n=s.nextInt();
            if(f==-1&&r==-1){
                f=0;
                r=0;
                item[r]=n;
            }
            else{
                r=r+1;
                item[r]=n;
            }
        }
    
}
public void dequeue()
{
   if(f==-1 && r==-1)
            System.out.print("Underflow");
        else{
            
            System.out.println("Dleted: "+item[f]);
            f=f+1;
        }
}

public void display()
{
    System.out.println("items are: ");
        for(int i=f;i<=r;i++)
        {
            System.out.println(item[i]+" ");
        }

}

}

