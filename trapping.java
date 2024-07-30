import java.util.*;


public class trapping {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);        
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedwater = 0;

        for(int i=0; i<n; i++){
         int waterLevel = Math.min(leftmax[i], rightMax[i]);
          trappedwater += waterLevel - height[i];
        }
        

        return trappedwater;
      



    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 8, 5 ,7};
        System.out.println(trappedRainwater(height));
        
    }
    
}


      