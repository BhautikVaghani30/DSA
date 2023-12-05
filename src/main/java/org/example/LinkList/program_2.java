package org.example.LinkList;

public class program_2 {
    public static void main(String[] args) {
//        2. Count nodes / length of linked list
        LL ll = new LL();
        ll.insertFront(10);
        ll.insertFront(20);
        ll.insertFront(30);
        ll.insertFront(40);
        ll.insertFront(50);
        ll.inserLast(60);
        ll.inserLast(70);
        ll.inserLast(80);
        ll.inserLast(90);
        ll.inserLast(100);
        ll.delete(60);
        ll.update(70,700);

        ll.print();

        ll.getheadtail();
        ll.countNode();

    }
}
