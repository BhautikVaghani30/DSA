package org.example.LinkList;

public class program_4 {
    public static void main(String[] args) {
        //    4. Get nth node in linked list
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
        ll.delete(60);
        ll.update(70,700);
        ll.print();
        System.out.println(ll.getNthNode(5));
        ll.print();
    }

}
