package org.example.LinkList;

public class program_18 {
    public static void main(String[] args) {
//        18. Reverse a Doubly Linked List
        DLL dll = new DLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        dll.reversDubly();
    }
}
