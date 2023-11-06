package area;

public class rajshahee {

	public static void main(String[] args) {
		// TODO parameter in static method
		rajshahee.lost(4500);
		rajshahee.found("Nazmin", " Zafor");
		rajshahee.car('H');
		

	}
	public static void lost(int a) {
		System.out.println(a);
	}
	public static void found(String a, String b) {
		String c= a+b;
		System.out.println(c);
	}
	public static void car(char s) {
		
		System.out.println(s);
	}

}
