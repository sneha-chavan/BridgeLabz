package Generic.Max;

public class MaxInt<E> {
	private E x,y,z;
	
	public MaxInt(E x, E y, E z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	

	public static <E extends Comparable<E>> E maximum(E r,E q, E c) {
		E max = r;
		if(q.compareTo(max)>0) {
			max=q;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}


	public static void main(String[] args) {
		
		Integer x=1,y=2,z=3;
		Float l=0.1f, h=0.6f,g=9.6f;
		String r="hi",q="hello",c="world";
		System.out.println(maximum(x,y,z));
		System.out.println(maximum(l,h,g));
		System.out.println(maximum(r,q,c));
		
		
	}

	
}
