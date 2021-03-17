package day25overridingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	/*
	 1) Exceptions are ucexcepted errors in java
	 2) Exceptions can handle by using try-catch blocks
	 3) AritmaticException is thrown by java in RunTime if there is any issue in Mathematical Operations.
	 4) FileNotFoundException occurs in Compile Time E., if there is any issue in the Path of the file or in the exixtence of the file.
	 */
	public static void main(String[] args) {
		//FileInputStream  fis = new FileInputStream("/techproedsummer2020turkish02/src/day30exceptions/fileForExc");
								// Unhandled exception type FileNotFoundException (İşlenmemiş istisna türü FileNotFoundException)
		FileInputStream  fis = null;
		try {
			 fis = new FileInputStream("/Users/kemalgurler/eclipse-workspace/techproedsummer2020turkish2/src/day01variables/techproedsummer2020turkish02/src/day30exceptions/fileForExc");
		
		}catch(FileNotFoundException e) {
			
			System.out.println("File is deleted or the path is wrong ");
		}
	}

}
