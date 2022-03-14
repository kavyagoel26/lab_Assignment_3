package a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AttachPhoto {

	public static void main(String[] args) {

		
		long start = System.currentTimeMillis();

		try {
			FileReader fr = new FileReader("C:\\Users\\MY DELL\\Desktop\\flowers.jpg");
			FileWriter fw = new FileWriter("C:\\Users\\MY DELL\\Desktop\\flowers.jpg");
			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");

		long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");

	}
}



