package com.jspider.Filehandling1.Operations;

import java.io.File;
import java.util.Scanner;

public class CharStreamRead2 {
	public static void main(String[] args) {
		File file = new File("Demo.text");
		if (file.exists()) {
			try {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				System.out.println("data is fetch from the file");
				scanner.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("file is not found");
		}
	}

}
