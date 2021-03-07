package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		
		 // Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
        // girilen degerlere gore   dikdorgenin kare olup olmadigini yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kontrol icin dikdortgenin kenar uzunluklarini giriniz");
        
        double k1=scan.nextDouble();
        double k2=scan.nextDouble();
        
        
        // System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
        
     String result = (k1>0 && k2 >0)?((k1==k2)?("Kare"):("Kare degil")):("Gecersiniz deger uzunlugu");
     System.out.println(result);
     
     scan.close();
}

}
	


