package pers.chh3213.exception20220101;

import java.io.*;
public class IOExp {
	public static void main(String[] args) {
	try {
		FileInputStream in = new FileInputStream("atguigushk.txt");
		int b;
		b = in.read();
		while (b!=-1) {
			System.out.print((char) b);
			b = in.read();
		}
		in.close();
	}catch (IOException e) {
		System.out.println(e);
	} finally {
	System.out.println(" It's ok!");
	}
	}
}
