package Generic.Max;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaxIntTest {
	MaxInt<Integer> maxInt;
	Integer x;
	Integer y;
	Integer z;
	String a="girls";
	String s="boys";
	String d="defaulter";
	

	@Before
	public void setUp() throws Exception {
		maxInt = new MaxInt<Integer>(x, y, z);
	}
	
	//Testing for Integer type data in common generics
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testFirstIntegerElementMax() {
		x=9;
		y=3;
		z=4;
		Assert.assertEquals(x, maxInt.maximum(x,y,z));
	}
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testSecondIntegerElementMax() {
		x=9;
		y=10;
		z=4;
		Assert.assertEquals(y, maxInt.maximum(x,y,z));
	}
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testThirdIntegerElementMax() {
		x=9;
		y=0;
		z=10;
		Assert.assertEquals(z, maxInt.maximum(x,y,z));
	}

	//For testing String Type Data in common Generic 
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testFirstStringElementMax() {
		a="FARRARI";
		s="BUGATI";
		d="AUDI";
		Assert.assertEquals(a, maxInt.maximum(a,s,d));
	}
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testSecondStringElementMax() {
		a="LTI";
		s="TATA";
		d="BridgeLabz";
		Assert.assertEquals(s, maxInt.maximum(a,s,d));
	}
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testThirdStringElementMax() {
		a="Appendable";
		s="EnumConstantNotPresentException";
		d="NumberFormatException";
		Assert.assertEquals(d, maxInt.maximum(a,s,d));
	}


}
