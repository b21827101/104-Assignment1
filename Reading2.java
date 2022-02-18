import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Reading2 {
	static String[][] array4;
	public static String[] readFile(String path) {
		try {
		int i=0;
		int length1 = Files.readAllLines(Paths.get(path)).size();
		String[] results1 = new String[length1];
			for (String line1 : Files.readAllLines(Paths.get(path))) {
				results1[i++] = line1 ;
			}
		return results1;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Main getmain1=new Main();//call the main class
		String[] lines1 = readFile(getmain1.argument4);
		String[][] array2 = new String[lines1.length][];//adjusting the length of the array2
		int z=0;
		for (String line1:lines1) {
			String[] pieces = line1.split("\t");//separation from tab
			array2[z]=new String[pieces.length];//adjusting the length of the each row
			for(int i=0;pieces.length>i;i++) {
				array2[z][i]=(String)pieces[i];			
			}	
			z+=1;
		}
		array4=array2.clone();//copying array2 to array4				
	}				
}

