import java.util.Date;
import java.text.*;
import java.text.ParseException; 

public class Total {
	public static void main(String[] args) {
		Reading1 shopping1 = new Reading1();//I called this class and reached array3
		shopping1.main(null);

		Reading2 price1 = new Reading2();//I called PriceList class and reached array4
		price1.main(null);
		SimpleDateFormat sdformat = new SimpleDateFormat("dd.MM.yyyy");//using method to find that the date is in the correct range
		
		for(int x=0;x<shopping1.array3.length;x++) {
			System.out.println("---"+shopping1.array3[x][0]+"---");//names of ShoppingList.txt
			float total=0;
			String total3;
			for(int a =3;a<shopping1.array3[x].length;a++) {
				
				for(int z=0;z<price1.array4.length;z++) {
					Date date1=null;
					Date date2 =null;
					Date date3=null;
					try {
						date1 = sdformat.parse(shopping1.array3[x][2]);//create date1
					    date2 = sdformat.parse(price1.array4[z][3]);
					    date3 = sdformat.parse(price1.array4[z][2]);
						
					}
					catch(ParseException e) {
						e.printStackTrace();
					}

					if(shopping1.array3[x][1].equals(price1.array4[z][1]) && shopping1.array3[x][a].equals(price1.array4[z][0]) && 
							((date3.before(date1) && date2.after(date1))|| date1.equals(date2) || date1.equals(date3)))
						//using before and after method for check the status of date
					{
						float result = Float.parseFloat(shopping1.array3[x][a+1]);//converting from string to float
						float result1 = Float.parseFloat(price1.array4[z][4]);
						System.out.print(shopping1.array3[x][a]+"	"+price1.array4[z][4]+"	"+shopping1.array3[x][a+1]+"	");
						String result2=String.format("%.1f", (result*result1) );//print only the first digit after the point.
						String result3=result2.replace(',', '.');//replacing comma to dot
						System.out.print((result3));
						System.out.println("");
						total=total+(result*result1);

					}
				}
			}
			String total1=String.format("%.1f", total) ;//print only the first digit after the point.
			String total2=total1.replace(',', '.');//replacing comma to dot
			System.out.print("Total	"+total2);
			System.out.println("");
		}
	}
}
