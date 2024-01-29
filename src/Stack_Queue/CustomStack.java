package Stack_Queue;

public class CustomStack {
    protected int[] data;
    private static final int DEAFAULT_SIZE = 10;
    int ptr =-1;
    public CustomStack(){
        this(DEAFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return ptr == data.length - 1; //ptr is at last index.
    }
    public boolean isEmpty(){
        return ptr == -1; // when ptr is value is -1 means stack is empty
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return  true;
    }
    public int pop() throws StackExpetions { // pop will remove the element from the stack
        if (isEmpty()){
            throw new StackExpetions("Cannot pop from an empty stack!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws StackExpetions {
        if (isEmpty()){
            throw new StackExpetions("Cannot peek stack is empty");
        }
        return data[ptr];
    }
}
