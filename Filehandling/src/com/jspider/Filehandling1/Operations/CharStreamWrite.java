package com.jspider.Filehandling1.Operations;

import java.io.File;
import java.io.FileWriter;

public class CharStreamWrite {
	public static void main(String[] args) {
		File file = new File("Demo.text");
		if (file.exists()) {
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("data from the java program");
				System.out.println("data is written inside file");
				fileWriter.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			try {
				file.createNewFile();
				System.out.println("file is created");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("string from else block");
				System.out.println("data is written into file 2");
				fileWriter.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
