// public class counting {
//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }
//      int count[] = new int[largest+1];
//      for(int i=0; i<arr.length; i++){
//         count[arr[i]]++;
//      }
//       int j =0;
//      for(int i=0; i<count.length; i++){
//         while (count[i] > 0) {
//             arr[j] = i;
//             j++;
//             count[i]--;
//         }
//      }
        
//     }
//     public static void main(String[] args) {
//         int arr[] = {5, 4, 3, 1, 2};
//         countingSort(arr);
//         printArr(arr);
//     }
    
// }
public class Countingw {
    public static void countingSort(int arr[]) {
        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to store the count of each unique element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sort the array using the count array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2};
        countingSort(arr);
        printArr(arr);
    }
}
