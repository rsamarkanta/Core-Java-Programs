package com.ts.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadAFile {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("------------Write operation to a FIle--------------\n");
		try {
			FileWriter fw = new FileWriter("C:/Users/TechSamar/Desktop/abc.txt");
			try {
				// write to the file
				fw.write("Java Programming .");
			} finally {
				fw.close();// close FileWriter
			}
			System.out.println("Data writing successful...");
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("\n------------Read operation from a FIle--------------\n");
		try {
			FileReader fr = new FileReader("C:/Users/TechSamar/Desktop/abc.txt");
			try {
				int i;
				// read characters one by one
				while ((i = fr.read()) != -1) {
					// print character one by one
					System.out.print((char) i);
				}
			} finally {
				fr.close(); // close FileReader
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
