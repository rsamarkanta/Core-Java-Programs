package com.ts.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFromFIle {

	public static void main(String[] args) throws IOException {

		System.out.println("\n-----------------To rename a file-------------n");

		File f1 = new File("C:/Users/TechSamar/Desktop/abc.txt");

		File f2 = new File("C:/Users/TechSamar/Desktop/demo1.txt");

		if (f1.exists()) {

			// rename abc.txt to demo.txt
			System.out.println(f1.renameTo(f2));

		} else {

			System.out.println("File does not exists.");

		}

		System.out.println("\n--------------To Copy file content-----------\n");

		FileInputStream fis = new FileInputStream("C:/Users/TechSamar/Desktop/demo1.txt");
		FileOutputStream fos = new FileOutputStream("C:/Users/TechSamar/Desktop/demo2.txt");

		int i;
		// copy characters from demo1 and write it to demo2
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}

		// close file objects
		fis.close();
		fos.close();

		System.out.println("Data writing successful...");

	}

}
