package com.jspider.Filehandling1.Operations;

import java.io.File;

public class CreateFile2 {
public static void main(String[] args) {
	File file = new File("D:\\File\\Demo.java");
	try {
		boolean status = file.createNewFile();
		if (status) {
			System.out.println("file is created");
		}else {
			System.out.println("file is already exists");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
