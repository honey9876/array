public class pairs {
public static void printPairs(int numbers[]) {
    for(int i=0; i<numbers.length; i++){
        int curr = numbers[i];
        for(int j=i+1; i<numbers.length; j++){
            System.out.print("(" + curr + numbers[j] + ") ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        printPairs(numbers);
    }
    
}
