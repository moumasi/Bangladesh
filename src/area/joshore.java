package area;

public class joshore {

	public static void main(String[] args) {
		// TODO return method in non static
		joshore pool=new joshore();
		pool.fan();
		pool.sun();
		pool.moon();
		pool.fall();
		

	}
	public int fan() {
		int a=6000;
		System.out.println(a);
      return a;
	}
	public double sun() {
		double s=80.90;
		System.out.println(s);
		return s;
	}
	public char moon() {
		char right= 't';
		System.out.println(right);
		return right;
	}
      public String fall() {
    	  String t="Tanvir";
    	  System.out.println(t);
    	  return t;
      }
}
