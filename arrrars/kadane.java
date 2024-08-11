public class kadane {
   public static void kadanes(int numbers[]) {
     int ms = Integer.MIN_VALUE;
     int cs = 0;

     for(int i=0; i<numbers.length; i++){
        cs = cs + numbers[i];
        if (cs < 0) {
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println("out max subarrray sum is :" + ms);

   }


public static void main(String[] args) {
    int number[] = {1, -2, 3, 4 -5 ,3};
    kadanes(number);
}
    
}
