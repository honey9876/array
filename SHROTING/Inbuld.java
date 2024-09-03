import java.util.Arrays;
import java.util.Collections;

public class Inbuld {
    public static void InsertionSort(Integer arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        
    }



    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        // printArr(arr);
    }
    
}
