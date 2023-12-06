package org.example.LinkList;
import org.example.LinkList.DLL;
public class program_17 {
    public static void main(String[] args) {
//        17. Find pairs with given sum in sorted doubly linked list
        DLL dll = new DLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.getSumOfpairs(8);
    }
}
