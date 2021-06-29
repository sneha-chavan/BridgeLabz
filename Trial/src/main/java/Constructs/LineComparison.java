package Constructs;

public class LineComparison {
	public static final int x1=2;
	public static final int y1=3;
	public static final int x2=5;
	public static final int y2=6;
	
	public static int LengthOfLine() {
		int length;
		int x= (int)Math.pow(x2-x1, 2);
		int y = (int) Math.pow(y2-y1, 2);
		length = (int)Math.sqrt(x+y);
		return length;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Computation Program");
		
		System.out.println("Length of Line: "+LengthOfLine());
	}

}
