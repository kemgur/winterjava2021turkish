package day08_ifelseifnestedif;

import java.util.Scanner;

public class C6_NestedIfOdevTekrar {

	// Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
	//Ask the user to enter a 4 digit number.
    // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
	//If the number entered by the user is divided by 5, check the last digit.
    // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
	//If the last digit is 0, print an "even number divided by 5" on the screen.
    // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
	//If the last digit is not 0, print "odd number divided by 5".
    // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
	//If the password she entered is not divided into 5, print "Try again" on the screen
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter 4 digit number");
		int num= scan.nextInt();
		
		if(num>=1000 && num<=9999) {
			if(num%5==0) {
				if(num%10==0) {
					System.out.println("5’e bölünen çift sayı");
				}else {
					System.out.println("5’e bölünen tek sayı");
				}	
			}else {
				System.out.println("tekrar deneyin");
			}
		}else {
			System.out.println("Pls enter 4 digits numbers");
		}
		scan.close();
	}
}
