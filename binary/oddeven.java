import java.util.*;

public class OddEven {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is an even number");
        }
        else {
            System.out.println(n + " is an odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);   // odd
        oddorEven(11);  // odd
        oddorEven(123); // odd
    }
}
