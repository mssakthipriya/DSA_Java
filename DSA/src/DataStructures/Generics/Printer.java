package DataStructures.Generics;

public class Printer<T> {
	T thingstoPrint;
	
	public Printer(T thingstoPrint) {
		this.thingstoPrint = thingstoPrint;
				
	}
	
	public void print() {
		System.out.println(thingstoPrint);
	}

}
