package Stack_Queue;

import java.util.*;

public class inBuiltStack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(43);
        queue.add(56);

        System.out.println(queue.remove());
        System.out.println(queue.peek());

        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(89);
        deq.addLast(83);
        deq.removeFirst();
    }
}
