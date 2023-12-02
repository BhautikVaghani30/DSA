package org.example.Array;

public class program_17 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int p = 0;
        int v = 10;
        p = insert(arr,p,10);
        p = insert(arr,p,20);
        p = insert(arr,p,30);
        p = insert(arr,p,40);
        p = insert(arr,p,50);
        update(arr,p,20,15);
        print(arr,p);
        p=delete(arr,p,30);
        print(arr,p);






    }

    private static int delete(int[] arr, int p, int i) {
        for (int j = 0; j < p; j++) {
            if (arr[j] == i){
                for (int k = j; k <= p-1; k++) {
                    int t = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = t;
                }
            }
        }
        return --p;
    }

    private static String search(int[] arr, int p, int s) {
        for (int i = 0; i < p; i++) {
            if(arr[i] == s) return "present";
        }
        return "Not present";
    }

    private static void update(int[] arr, int p, int old, int new_val) {
        for (int j = 0; j < p; j++) {
            if (arr[j] == old){
                arr[j] = new_val;
            }
        }

    }

    private static void print(int[] arr, int p) {
        for (int i = 0; i < p; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int insert(int[] arr, int p, int v) {
        arr[p] = v;
        p++;
        return p;
    }
}
