package com.jspider.Filehandling1.Operations;

import java.io.File;
import java.io.FileReader;

public class CharStreamRead {
	public static void main(String[] args) {
		File file = new File("demo.text");
		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(file);
				int ch = fileReader.read();
				System.out.println((char)ch);
				System.out.println("data is fetchfrom the file");
				fileReader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {

		}
	}
}
