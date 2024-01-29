package LinkedList;

import java.util.LinkedList;

public class llmain{
    public static void main(String[] args) {
        /*
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(76);
        list.insertFirst(34);
        list.insertFirst(87);
        list.insertFirst(23);
        list.insertLast(92);
        list.insertAt(100,3);
        list.display();
        list.deleteLast();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        System.out.println(list.find(100));
        */

        /*
        DoublyLL list = new DoublyLL();
        list.insertFirst(4);
        list.insertFirst(76);
        list.insertFirst(34);
        list.insertFirst(87);
        list.insertLast(11);
        list.display();
        list.insertAfter(4,96);
        list.display();
        */

        CirclularLL list = new CirclularLL();

        list.insert(45);
        list.insert(12);
        list.insert(85);
        list.display();
    }
}
