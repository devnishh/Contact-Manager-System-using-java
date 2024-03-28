package com.jspider.Filehandling1.Operations;

import java.io.File;

public class FileInfo {
public static void main(String[] args) {
	File file = new File("D:\\File\\Demo.text");
	//boolean  status=file.createNewFile("D:\\Demo.text");
	
	System.out.println(file.getName());
	System.out.println(file.getAbsolutePath());
	System.out.println(file.length());
	if (file.canExecute()) {
		System.out.println("file can executeable");
	}else {
		System.out.println("file is not executable");
	}if (file.canRead()) {
		System.out.println("file is readable");
	}else {
		System.out.println("file is not readable");
	}if (file.canWrite()) {
		System.out.println("file is wriable");
	}else {
		System.out.println("file is not wriable");
	}if (file.isDirectory()) {
		System.out.println("we make make directory");
	}else {
		System.out.println("we can not");
}
}
}
