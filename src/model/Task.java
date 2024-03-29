package model;

public class Task {
    public static void main(String[] args) {
        System.out.println("Soal no 2");
        int[] arr1 = {2,3,4,5};
        int[] arr2 = {1,3,5,7};

        //2 dibandingkan dengan arr2
        for(int i = 0; i < arr1.length;i++){
            for(int j = 0; j < arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
        System.out.println("batassss");
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j){
                    System.out.println(i);
                }
            }
        }

        //nomor 3
        System.out.println("soal nomor 3");
        int[] arr = {3,2,4,1,5};
        int temp = 0;
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }    
        };
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
}
