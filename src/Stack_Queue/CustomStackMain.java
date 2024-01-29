package Stack_Queue;

public class CustomStackMain {
    public static void main(String[] args) throws StackExpetions {
        CustomStack stack = new DynamicStack();
        stack.push(4);
        stack.push(54);
        stack.push(74);
        stack.push(87);
        stack.push(38);
        stack.push(4);
        stack.push(54);
        stack.push(74);
        stack.push(87);
        stack.push(38);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
