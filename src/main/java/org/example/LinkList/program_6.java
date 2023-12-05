package org.example.LinkList;

public class program_6 {
    public static void main(String[] args) {
//        6. Given only a pointer to a node to be deleted in a singly linked list, how do you delete
//        it? (head not given)
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
        ll.inserLast(100);
        ll.print();
//        ll.deleteNode(60);

    }
}
