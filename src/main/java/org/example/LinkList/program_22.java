package org.example.LinkList;

public class program_22 {
    public static void main(String[] args) {
//        22. Remove duplicates from singly linked list
        LL ll = new LL();
        ll.inserLast(10);
        ll.inserLast(60);
        ll.inserLast(30);
        ll.inserLast(10);
        ll.inserLast(50);
        ll.inserLast(60);
        ll.print();
        ll.removeDuplicatesSingli();
        ll.print();
    }
}
