package org.example.Tree;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
class custam {
    Node root;
    public void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inorder(Node root) {
        if (root==null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void postorder(Node root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public int countNode(Node root) {
        if (root == null){
            return 0;
        }

        int x = countNode(root.left);
        int y = countNode(root.right);
        return x+y+ root.data;
    }

    public int  sumNode(Node root) {
        if (root == null){
            return 0;
        }
        int x = sumNode(root.left);
        int y = sumNode(root.right);
        return x+y+ root.data;
    }

    public int hightNode(Node root) {
        if (root == null){
            return 0;
        }
        int leftHight = hightNode(root.left);
        int rightHight = hightNode(root.right);
        int maxhight = Math.max(leftHight,rightHight)+1;
        return maxhight;
    }

    public void levelOrderPattern(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curr = q.remove();
            if (curr==null){
                System.out.println();
                if (q.isEmpty()) break;
                else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }

    }
    public void findAnElement(Node root, int i) {
        if (root == null) return;
        findAnElement(root.left,i);
        if (root.data == i){
            System.out.println("present");
        }
        findAnElement(root.right,i);
    }

    public void findkthNode(Node root, int i) {
        List<Integer> list = new ArrayList<>();
        inorder_find(root,list);
        if (i>0 && i <= list.size()){
            System.out.println(list.get(i-1));
        }else{
            System.out.println("Not a node");
        }
    }

    private void inorder_find(Node root, List<Integer> list) {
        if (root==null) return;
        inorder_find(root.left,list);
        list.add(root.data);
        inorder_find(root.right,list);
    }
    static int i = -1;

    public Node program_7(int[] arr) {
        i++;
        if (arr[i] == -1){
            return null;
        }
        Node newNode = new Node(arr[i]);
        newNode.left = program_7(arr);
        newNode.right = program_7(arr);
        return newNode;
    }

    public void program_8(Node root) {
        Queue<Integer> q = new LinkedList<>();
        q.add(root.data);
        q.add(null);

    }

    public void program_9(Node root) {
        if (root == null) return;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null){
                s.push(curr.right);
            }
            if (curr.left != null){
                s.push(curr.left);
            }

        }
    }

    public void program_10(Node root) {
        if (root==null) return;
        Stack<Node> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            Node curr = s.pop();
            s2.push(curr.data);
            if (curr.left != null) s.push(curr.left);
            if (curr.right != null) s.push(curr.right);

        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
        }
    }
}

public class tree {
    public static void main(String[] args) {
        custam tree = new custam();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.left.left=new Node(50);
        tree.root.left.right = new Node(60);
        tree.root.right.right=new Node(70);
        tree.root.right.left=new Node(80);
        tree.root.right.right.left=new Node(90);
//        tree.preOrder(tree.root);
//        tree.inorder(tree.root);
        tree.postorder(tree.root);
//        tree.levelOrder();
//        tree.levelOrderPattern(tree.root);
//        System.out.println(tree.countNode(tree.root));
//        System.out.println(tree.sumNode(tree.root));
//        System.out.println(tree.hightNode(tree.root));
//        tree.findkthNode(tree.root,3);
//        tree.findAnElement(tree.root,40);
        int[] arr = {
                1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1
        };
//        Node root = tree.program_7(arr);
//        System.out.println(root.data);
//        tree.program_8(tree.root);
        System.out.println();
//        tree.program_9(tree.root);
        tree.program_10(tree.root);


    }
}
