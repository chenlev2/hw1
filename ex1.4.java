import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner  scn = new Scanner(System.in);
		System.out.println("enter a number beteween 1-50");
		String numStr = scn.next();
		float num = Float.valueOf(numStr);
		
		float prcent = (1/num)*100;
		System.out.println(prcent);
		File f = new File ("test.html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		String green = "<div style=\" width :"+prcent+"%; height: 100%; background-color: green; float :left;\" > </div>";
		String blue =  "<div style=\" width :"+prcent+"%; height: 100%; background-color: blue; float :left;\" > </div>";
		String red = "<div style=\" width :"+prcent+"%; height: 100%; background-color: red; float :left;\" > </div>";
		for (int i = 0 ; i< num ; i++) {
			if(i%3 == 0)
				bw.write(blue);
			if(i%3 == 1)
				bw.write(red);
			if(i%3 == 2)
				bw.write(green);
		}
		String html = "<div><h1>Hello world</h1></div>";


		
		bw.close();

	}

}
