
public class leaner {
    public static int leaners(int number[], int key){
        for(int i=0; i<number.length; i++) {
            if(number[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 10, 12, 14, 16};
        int key = 14;


        int index = leaners(number, key);
        if (index == -1) {
            System.out.println("not found");
        }
        else {
            System.out.println("key is at index : " + index);
        }
        
    }


}