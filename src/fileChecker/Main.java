package fileChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		File file = new File("test.txt");
		Scanner scan;
		Scanner input = new Scanner(System.in);
		FileWriter w;
		String msg = input.next();
		
		
		try {
			w = new FileWriter(file);
			w.write(msg);
			w.close();
			scan = new Scanner(file);
			
			
			while(scan.hasNext()) {
				String inp = scan.next();
				
				System.out.println(inp);
			}
			scan.close();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


}
