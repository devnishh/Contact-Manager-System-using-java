package com.jspider.Filehandling1.Operations;

import java.io.File;
import java.io.FileOutputStream;

public class ByteStreamWrite {
	public static void main(String[] args) {
		File file = new File("demo.text");
		if (file.exists()) {
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(1220);
				System.out.println("data is written inside the file");
				fileOutputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			try {
				file.createNewFile();
				System.out.println("file is created");
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(2012);
				System.out.println("data is written by else block");
				fileOutputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
