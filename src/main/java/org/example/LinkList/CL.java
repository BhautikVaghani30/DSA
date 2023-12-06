package org.example.LinkList;

public class CL {
    int size;
    Node head;
    Node tail;


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void checkLinkListCircular() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = head;

        while (current.next != null && current.next != head) {
            current = current.next;
        }

        if (current.next == head) {
            System.out.println("Linked list is circular.");
        } else {
            System.out.println("Linked list is not circular.");
        }
    }
    public void getSize(){
        System.out.println("Size of circular Link list is : " + size);
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    public void print(){
        if (head == null){
            System.out.println("Empty Link List");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println();
    }

    public static void main(String[] args) {
        CL cl = new CL();
        cl.addNode(10);
        cl.addNode(20);
        cl.addNode(30);
        cl.addNode(40);
        cl.addNode(50);

        cl.print();

    }
}
