package loop;

public class charres {
    
  public static void main(String args []) {
     
   int n = 9;
   char ch = 'Z';
   
   
   for(int line=1; line<=n; line++){

    for(int chers=1; chers<=line; chers++){
        System.out.print(ch);
      ch++;
    }

    System.out.println();
   }
}
}
