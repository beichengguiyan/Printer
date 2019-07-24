package printer;

public class Test {
	public static void main(String[] args) {

		Printer a = new Colourprinter();
		Printer b = new Blackandwhiteprinter();
		a.printing();
		b.printing();
	}
}