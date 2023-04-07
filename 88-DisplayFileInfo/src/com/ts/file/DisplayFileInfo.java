package com.ts.file;

import java.io.File;

public class DisplayFileInfo {

	public static void main(String[] args) {
		// file path
		File f = new File("C:/Users/TechSamar/Desktop/abc.txt");
		if (f.exists()) {
			System.out.println("File Name : " + f.getName());
			System.out.println("File Location : " + f.getAbsolutePath());
			System.out.println("File Readable : " + f.canRead());
			System.out.println("File writable : " + f.canWrite());
			System.out.println("File Size : " + f.length());
		} else {
			System.out.println("File does not exists.");
		}
	}

}
