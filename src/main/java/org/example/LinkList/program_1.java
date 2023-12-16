package org.example.LinkList;
import org.example.LinkList.LL;
public class program_1 {
    public static void main(String[] args) {
//        1. Create, insert, delete, print, update, find in singly linked list
        LL ll = new LL();
        ll.insertFront(10);
        ll.insertFront(10);
        ll.insertFront(10);
        ll.insertFront(10);
        ll.insertFront(10);
//        ll.inserLast(60);
//        ll.update(60,0);
        ll.remove(10);
        ll.print();
    }
}
