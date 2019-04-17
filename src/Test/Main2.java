package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main2 {
	public static void main(String[] args) {
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(new File(args[0])));
			String line = null;
			int a = 0;
			int b = 0;
			int result = 0;
			line = in.readLine();
			a = Integer.parseInt(line.split(" ")[0]);
			b = Integer.parseInt(line.split(" ")[1]);

			/* YOUR CODE HERE */
			String m = String.valueOf(a * b);
			result = Integer.parseInt(m.charAt(m.length() - 2) + "" + m.charAt(m.length() - 1));

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
