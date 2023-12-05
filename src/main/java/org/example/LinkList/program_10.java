package org.example.LinkList;

public class program_10 {
    public static void main(String[] args) {
//        10. Remove duplicates from a sorted linked list
        LL ll = new LL();
        ll.inserLast(1);
        ll.inserLast(2);
        ll.inserLast(3);
        ll.inserLast(4);
        ll.inserLast(4);
        ll.inserLast(5);
        ll.inserLast(6);
        ll.print();
        ll.size();
        ll.RemoveDuplicate();
        ll.size();
        ll.print();

    }
}
