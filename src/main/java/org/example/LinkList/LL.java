package org.example.LinkList;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Stack;

public class LL {
    Node head;
    Node tail;
    int size;

    public void Print_Reverse() {
        Stack<Integer> st = new Stack<>();
        Node curr = head;
        while (curr != null){
            st.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while (!st.isEmpty()){
            curr.data = st.pop();
            curr = curr.next;
        }
    }

    public int getNthNode(int i) {
        int c = 1;
        Node curr = head;
        while(curr != null){

            if(c == i){
                return curr.data;
            }
            c++;
            curr = curr.next;
        }
        return -1;
    }

    public int getLastNthNode(int i) {
        if (head == null) return -1;
         Node curr = head;
         int c = size;
         while(curr != null){
             if (c==i){
                 return curr.data;
             }
             c--;
             curr=curr.next;
         }
        return -1;
    }

    public void print_middle_Node() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle node of the linked list is : " + slow.data);
    }

    public boolean Detect_loop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){

                return true;
            }

        }

        return false;
    }

    public int Find_Loop_Length() {
        if(!Detect_loop()) {
            System.out.println("Loop Not Found " );
            return 0;
        }
        Node slow = head, fast = head;

        // Detect loop using Floyd's algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there is a loop, move slow to the start and advance both pointers one node at a time
            if (slow == fast) {
                int count = 1;
                slow = slow.next;
                while (slow != fast) {
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }

        // No loop found
        return 0;
    }

    public void RemoveDuplicate() {
        Node curr = head;
        while(curr != null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;
        }
        return;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to the current node
            current = nextNode; // Move current to the next node
        }

        // Update the head to the last node (which was the original tail)
        head = prev;
    }

    public void size() {
        System.out.println("size of Link list is : " + size);
    }
//program_7
//    public void deleteNode(int i) {
//        Node temp = Node.next;
//        Node.data = temp.data;
//        Node.next = temp.next;
//    }

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            size++;
        }
    }
    
    public void insertFront(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;

        head = newnode;


    }
    
    public void print(){
        if (head == null){
            System.out.println("Empty LinkList ");
            return;
        }
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public void inserLast(int data) {
        Node newNode = new Node(data);
        if (tail == null && head == null){
           head = newNode;
           tail = newNode;
           return;
        }
        tail.next = newNode;
        tail = newNode;
    }

//    public static void main(String[] args) {
//        LL ll = new LL();
//        ll.insertFront(10);
//        ll.insertFront(20);
//        ll.insertFront(30);
//        ll.insertFront(40);
//        ll.insertFront(50);
//        ll.inserLast(60);
//        ll.inserLast(70);
//        ll.inserLast(80);
//        ll.inserLast(90);
//        ll.inserLast(100);
//        ll.delete(60);
//        ll.update(70,700);
//
//        ll.print();
//
//        ll.getheadtail();
//    }

    public void update(int i, int i1) {

            if (head == null && tail == null){
                System.out.println("LinkList is Empty");
                return;
            }else if(head.data == i){
                head = head.next;
            }else {
                Node temp = head;
                while (temp != null && temp.next != null) {
                    if (temp.data == i) {
                        temp.data = i1;
                        return;
                    }
                    temp = temp.next;
                }
            }
    }

    public void delete(int i) {
        if (head == null && tail == null){
            System.out.println("LinkList is Empty");
            return;
        }else if(head.data == i){
            head = head.next;
            size--;
            return;
        }else {
            Node temp = head;
            while (temp != null && temp.next != null){
                if (temp.next.data == i){
                    if (temp.next == tail){
                        tail = temp;
                    }
                    size--;

                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
    }


    public void getheadtail() {
        System.out.println("head data is : " + head.data);
        System.out.println("tail data is : " + tail.data);
    }

//    2. Count nodes / length of linked list
    public void countNode(){
        System.out.println("size of link list is : " + size);
    }

    public void removeDuplicatesSingli() {
        if (head == null) {
            return;
        }

        HashSet<Integer> uniqueValues = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            int data = current.data;


            if (uniqueValues.contains(data)) {
                previous.next = current.next;
            } else {

                uniqueValues.add(data);
                previous = current;
            }

            current = current.next;
        }


    }
}
