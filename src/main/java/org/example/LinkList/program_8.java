package org.example.LinkList;

public class program_8 {
    public static void main(String[] args) {
//        8. Detect loop in linked list
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
//        ll.inserLast(100);
        ll.print();
        ll.Detect_loop();
    }
}
