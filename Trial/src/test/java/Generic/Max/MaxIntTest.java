package Generic.Max;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaxIntTest {
	MaxInt maxInt;
	Integer x=null;
	Integer y= null;
	Integer z = null;
	
	@Before
	public void setUp() throws Exception {
		maxInt = new MaxInt(x, y, z);
	}

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testFirstElementMax() {
		x=9;
		y=3;
		z=4;
		Assert.assertEquals(x, maxInt.maxInt(x,y,z));
	}

}
