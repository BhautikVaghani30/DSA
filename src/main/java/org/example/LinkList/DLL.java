package org.example.LinkList;

import com.sun.security.auth.UnixNumericUserPrincipal;

import java.security.PublicKey;
import java.util.HashSet;

public class DLL {

    public void getSumOfpairs(int i) {
        Node left = head;
        Node right = tail;
        int start = 1;
        int end = size;
        while (start < end){
            int sum = left.data + right.data;
            if (sum == i){
                System.out.println("pairs of link list is  : " + left.data + " and " + right.data);
                return;
            } else if (sum<i) {
                start++;
                left=left.next;

            }else {
                end--;
                right = right.prev;
            }


        }
        System.out.println("pairs not found");
        return;
    }

    public void reversDubly() {
        if (head == null){
            System.out.println("Doubly link list is Empty");
            return;
        }
        Node curr = tail;
        while (curr != null){
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;

        }
        System.out.print("null");
    }



    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else if (value < head.data) {
           addfirst(value);
        } else {
            Node current = head;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void deleteNode(Node nodeToDelete) {
        // Case 1: If the node to be deleted is the head
        if (nodeToDelete == head) {
            head = nodeToDelete.next;
        }

        // Case 2: If the node to be deleted is the tail
        if (nodeToDelete == tail) {
            tail = nodeToDelete.prev;
        }

        // Case 3: Adjust pointers of the previous and next nodes
        if (nodeToDelete.prev != null) {
            nodeToDelete.prev.next = nodeToDelete.next;
        }
        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = nodeToDelete.prev;
        }
    }


    public void removeDuplicates() {
        if (head == null) {
            System.out.println("Doubly link list is Empty");
            return;
        } else if (head.data == head.next.data) {
            removeFisrt();
            return;
        } else if (tail.data == tail.prev.data) {
            removeLast();
            return;
        }else{
            Node curr = head;
            while(curr.next != null){
                if (curr.data == curr.next.data){
                    curr.next = curr.next.next;
                    if (curr.next != null) {
                        curr.next.prev = curr;
                    }
                }
                curr = curr.next;
            }
        }
    }

    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void remove(int i) {
        if (tail.data == i){
            removeLast();
            return;
        } else if (head.data == i) {
            removeFisrt();
            return;
        }
        Node curr = head;
        while (curr != null){

            if (curr.next.data == i){

                curr.next = curr.next.next;
                curr.prev = curr.next.prev;
                size--;
                return;
            }
        curr = curr.next;
        }
    }

    public void getHeadTail() {
        System.out.println("Head Data is : " + head.data);
        System.out.println("tail Data is : " + tail.data);
        return;
    }

    public void removeLast() {
        if (head == null){
            System.out.println("empty Link list");
            return;
        }
        if (size == 1){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return;
    }

    public void removeFisrt() {
        if (head == null){
            System.out.println("empty Link list");
            return;
        }
        if (size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    public void addLast(int i) {
        Node newnode = new Node(i);
        if (tail == null){
            head=tail=newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void getSize() {
        System.out.println("size of Dubly link list is : " + size);
        return;
    }

    public void print() {
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " <-> ");
            curr=curr.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void addfirst(int i) {
        Node newnode = new Node(i);
        if (head == null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void removeDuplicatesDubly() {
        if (head == null) {
            return;
        }

        HashSet<Integer> uniqueValues = new HashSet<>();
        Node current = head;
        while (current != null) {
            int data = current.data;
            if (uniqueValues.contains(data)) {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            } else {

                uniqueValues.add(data);
            }

            current = current.next;
        }
    }

}


