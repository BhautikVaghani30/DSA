package org.example.LinkList;

public class program_20 {
    public static void main(String[] args) {
//        20. Remove duplicates from a sorted doubly linked list
        DLL dll = new DLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        dll.removeDuplicates();
        dll.print();
    }
}
