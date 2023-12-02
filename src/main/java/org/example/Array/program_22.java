package org.example.Array;

public class program_22 {
    public static void main(String[] args) {
        int[] arr1 = {
                0,1,2,0,3,4,6,7,1,8,9
        };
        int[] arr2 = {
                9,3,5,6,8,2,6
        };
        findcommon(arr1,arr2);
    }

    private static void findcommon(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 < n2){
            for (int i = 0; i < n1; i++) {
                if (arr1[i] == -1) continue;
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i]);
                        arr1[i] = -1;
                        break;
                    }
                }
            }
        }else{
            for (int i = 0; i < n2; i++) {
                if (arr2[i] == -1) continue;
                for (int j = 0; j < n1; j++) {
                    if (arr2[i] == arr1[j]) {
                        System.out.print(arr2[i] + " ");
                        arr2[i] = -1;
                        break;
                    }
                }
            }
        }
    }

}
