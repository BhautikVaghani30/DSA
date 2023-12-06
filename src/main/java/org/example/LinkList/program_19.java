package org.example.LinkList;

public class program_19 {
    public static void main(String[] args) {
//        19. Insert value in sorted doubly linked list
        DLL dll = new DLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.insert(4);
        dll.print();
    }
}
