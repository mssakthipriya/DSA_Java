package DataStructures.Generics;

public class GenericsEg {
	
	public static void main(String[] args) {
		//Generics doesn't works with primitive types so need to use wrapper classes
		Printer<Integer> printer = new Printer<>(23);
		printer.print();
		
		Printer<String> stringPrinter = new Printer<>("Hello World !");
		stringPrinter.print();
	}

}
