import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Reading1 {

	static String[][] array3;
	public static String[] readFile(String path) {
		try {
		int i=0;
		int length = Files.readAllLines(Paths.get(path)).size();
		String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line ;
				
			}
		return results;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Main getmain=new Main();//call the main class
		String[] lines = readFile(getmain.argument3);
		String[][] array1 = new String[lines.length][];//adjusting the length of the array1
		int z=0;
		for (String line:lines) {
			String[] pieces = line.split("\t");//separation from tab
			array1[z]=new String[pieces.length];//adjusting the length of the each row
			for(int i=0;pieces.length>i;i++) {
				array1[z][i]=(String)pieces[i];			
			}	
			z+=1;
		}
		array3=array1.clone();//copying array1 to array3
	}		
}


