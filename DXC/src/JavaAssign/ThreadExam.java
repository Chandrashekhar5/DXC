package JavaAssign;
import java.io.*;

public class ThreadExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("A.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k;
		
		try {
			while((k = fis.read())!=-1) {
				System.out.println((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

