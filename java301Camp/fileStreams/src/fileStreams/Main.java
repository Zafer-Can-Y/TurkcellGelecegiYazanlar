package fileStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Output
		File file = new File("hello.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("Hello world!".getBytes());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// Input
		File file2 = new File("hello.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file2);
			int c = 0;
			while ((c = fileInputStream.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}