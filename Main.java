public class Main {
	public static String argument3;//First argument
	public static String argument4;//Second argument
	public static void main(String[] args) {
		String argument1=String.valueOf(args[0]);
		String argument2=String.valueOf(args[1]);
		argument3 = argument1;argument4 = argument2;
		Reading1 shopping = new Reading1();
		shopping.main(args);
		Reading2 price = new Reading2();
		price.main(args);
		Total total1 = new Total();
		total1.main(args);
		
		}

}
