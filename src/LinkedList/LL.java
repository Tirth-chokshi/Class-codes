package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    // to insert the first node in linkedlist
    public void insertFirst (int val){
        Node node = new Node(val); // this will create a new node box
        node.next = head; // if head-node of ll is existed then new node element set his next node to head-node
        head = node; // now the new node become first node so it have to be a head-node
        if (tail == null){ // if the tail does not exist means new node is the only node in ll
            tail = head; // so head and tail will be the same node
        }
        size++; // it will increase the size of ll
    }

    // to insert the last node in linkedlist
    public void insertLast(int val){
        if (tail!= null){ insertFirst(val); return; } // if tail is null then insertfirst Node-val
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    //insert at particular location/index
    public void insertAt(int val,int index){
        if (index == 0){ // at first node
            insertFirst(val); return;
        }
        if (index == size){ // at last node
            insertLast(val); return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next); // this will execute the constructor that have same arguments
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secoundLast = get(size-2);
        int val = tail.value;
        tail = secoundLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    //to find any node in ll
    public Node find(int val){
        Node node = head; // start finding from head
        while (node!= null){
            if (node.value == val){ // if node value is equal to enterd then value found
                return node;
            }
            node = node.next; // otherwise keep moving next and loop will run again till found
        }
        return null; // if element not found return null
    }
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node pre = get(index-1);
        int val= pre.next.value;
        pre.next= pre.next.next;
        return val;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
