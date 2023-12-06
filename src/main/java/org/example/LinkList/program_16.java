package org.example.LinkList;
import org.example.LinkList.DLL;
public class program_16 {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.remove(3);
        dll.getHeadTail();
        dll.getSize();
        dll.print();
//        dll.getSumOfpairs(7);
    }
}
