public class compare {
    public static void main(String[] args) {
        String s1 = "TONY";
        String s2 = "TONY";
        String s3 = new String("TONY");

        // if (s1 == s2) {
        //     System.out.println("string are equal!");
        // }
        // else{
        //     System.out.println("string are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("string are equal");
        // }
        // else{
        //     System.out.println("string are  not equal!:");
        // }

        if (s1.equals(s3)) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}
