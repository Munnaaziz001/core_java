//////public class Bub {
//////    public static void main(String[] args) {
//////        int [] arr = {8,2,6,5,7,4,12,1,3};
//////        int N = arr.length;
//////        for(int i=0; i<N; i++) {
//////            for (int j = 1; j < N - i; j++) {
//////                if (arr[j] < arr[j - 1]) {
//////                    int temp = arr[j - 1];
//////                    arr[j - 1] = arr[j];
//////                    arr[j] = temp;
//////
//////                }
//////            }
//////        }
//////        System.out.print("sorted Array is: ");
//////        for(int i1 = 0; i1 <N; i1++)
//////        {
//////            System.out.print(arr[i1]+" ");
//////
//////
//////        }
//////
//////    }
//////}
////public class Bub{
////    public static void main(String[] args) {
////        int [] arr = {7,5,24,69,51,66,74,2,1,20,10,3};
////        int n = arr.length;
////        for(int i = 0; i<n; i++)
////        {
////            for(int j = 1; j<n-i; j++)
////            {
////                if(arr[j] < arr[j-1])
////                {
////                    int temp = arr[j];
////                    arr[j] = arr[j-1];
////                    arr[j-1] = temp;
////                }
////            }
////        }
////        System.out.print("Sorted Array are:  ");
////        for(int i = 0 ; i < arr.length; i++)
////        {
////            System.out.print(arr[i]+ "  ");
////        }
////    }
////
////    }
public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = {5, 6, 2, 565,3, 10, 4, 1, 85};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) { int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } }}System.out.print("Sorted Array are:  ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
