package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForLoop {
	  /*
    Kullanicidan pozitif bir rakam girmesini isteyin ve 
    girilen rakama gore asagidaki sekli cizdirin
   *
   * *
   * * *
   * * * * 
   
    */
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("10'dan kucuk pozitif bir tamsayi girin");
   int sayi=scan.nextInt();
   
   for (int i = 1; i <=sayi; i++) {
       System.out.println(" ");
   
       for (int j = 1; j <=i; j++) {
           System.out.print("* ");
       }
   }
   scan.close();
}
}
