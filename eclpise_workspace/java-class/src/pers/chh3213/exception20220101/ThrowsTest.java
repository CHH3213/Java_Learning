package pers.chh3213.exception20220101;

import java.io.*;
public class ThrowsTest {
	public static void main(String[] args) {
	ThrowsTest t = new ThrowsTest();
	try {
		t.readFile();
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
	public void readFile()throws IOException{
		FileInputStream in = new FileInputStream ("atguigushk.txt");
		int b;
		b = in.read();
		while (b !=-1) {
			System.out.print((char) b);
			b= in.read();
		}
	in.close();
	}
}