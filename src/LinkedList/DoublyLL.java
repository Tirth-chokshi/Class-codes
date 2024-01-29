package LinkedList;

public class DoublyLL {

    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node; // new node will become head
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node((val));
        Node last = head;  // finding the last node
        node.next = null;
        if (head == null){ // edge case
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!= null){
            last = last.next;
        }
        node.prev = last;
        last.next = node;
    }
    public Node find(int val){
        Node node = head; // start finding from head
        while (node!= null){
            if (node.val == val){ // if node value is equal to enterd then value found
                return node;
            }
            node = node.next; // otherwise keep moving next and loop will run again till found
        }
        return null; // if element not found return null
    }
    public void insertAfter(int after,int val){
        Node p = find(after);
        if (p == null){
            System.out.println("dosenot exits");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next!= null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node!= null){
            System.out.print(node.val+ " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last!= null){
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        Node next , prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
