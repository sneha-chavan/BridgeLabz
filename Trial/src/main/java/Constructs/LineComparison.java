package Constructs;

public class LineComparison {
	public static int x1;
	public static int y1;
	public static int x2;
	public static int y2;
	public static int lengthXY,lengthAB;
	
	public LineComparison(int x1,int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public static int LengthOfLine() {
		int length;
		int x= (int)Math.pow(x2-x1, 2);
		int y = (int) Math.pow(y2-y1, 2);
		length = (int)Math.sqrt(x+y);
		return length;
	}
	public static Boolean lineEquality(Integer lineOne, Integer lineTwo) {
		if (lineOne.equals(lineTwo)) {
			return true;
		}
		return false;
	}
	public static void lineCompare(Integer lineOne, Integer lineTwo) {
		int result = Integer.compare(lineOne, lineTwo);
		if (result>0) {
			System.out.println("LineXY is greater");
		}
		else if (result<0) {
			System.out.println("LineAB is greater");
		}
		else System.out.println("Both lines are equals");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Computation Program");
		LineComparison lineXY = new LineComparison(2, 2, 5, 4);
		Integer lengthXY = LengthOfLine();
		LineComparison lineAB = new LineComparison(9, 4, 2, 6);
		Integer lengthAB = LengthOfLine();
//		System.out.println(lengthAB);
//		System.out.println(lengthXY);
		if (lineEquality(lengthXY, lengthAB)) {
			System.out.println("Both lines are euqal with length: "+ lengthAB);
		}
		else {
			System.out.println("Both lines having different lengths");
		}
		lineCompare(lengthAB, lengthXY);
	}

}
