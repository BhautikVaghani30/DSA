package org.example.LinkList;

public class program_23 {
    public static void main(String[] args) {
//        23. Remove duplicates from doubly linked list
        DLL dll = new DLL();
        dll.addLast(5);
        dll.addLast(2);
        dll.addLast(4);
        dll.addLast(3);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(1);
        dll.print();
        dll.removeDuplicatesDubly();
        dll.print();
    }
}
