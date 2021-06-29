package ClassMethodObj;

public class Charge {

	private static final double k= 8.99e08; //it resides at Memory level bcoz of static
	private final double rx;
	private final double ry;
	private final double q;
	
	public Charge(double a, double b, double x) {
		this.rx=a;
		this.ry=b;
		this.q=x;
	}
	private double potentialAt(double x, double y) {
		
		double dx= x -rx;
		double dy = y-ry;
		return k * q / Math.sqrt(dx*dx+dy*dy);
	}
	
	@Override
	public String toString() {
		return q + " at " + "(" + rx+ ","+ ry+ ")";
	}
	
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		Charge c1 = new Charge(0.51, 0.65, 0.34);
		Charge c2 = new Charge(0.22, 0.78, 0.45);
		double v1 = c1.potentialAt(x, y);
		double v2 = c2.potentialAt(x, y);
		System.out.printf("%.2e\n",(v1+v2));
		
	}
	
}
