package Arrays;

public class Insertion_Sort {

    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
        private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j>=0 && temp < arr[j]) {
                arr[j+1] = arr[j];

                j--;
            }
            arr[j+1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 13, 4, 1, 3, 6, 28};
        insertionSort(arr);
        PrintArray(arr);
//
    }
}

//    public static void insertion(int arr[]) {
////
////        for (int i = 0; i < arr.length; i++) {
////            int compare = arr[i];
////            int j = i - 1;
////
////            while (j >= 0 && compare < arr[j]) {
////                arr[j + 1] = arr[j];
////                j--;
////            }
////            arr[j + 1] = compare;
////        }
////    }
////
////    public static void main(String[] args) {
////        int arr[] = {1, 3, 4, 2, 5, 6, 7, 9};
////        insertion(arr);
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i] + " ");
////        }

