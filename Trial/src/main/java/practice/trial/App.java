package practice.trial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
//<<<<<<< HEAD
    	LOG.warn("Warning due to changes in Local Only");
	    LOG.warn("this changes done only from github");
//>>>>>>> d702b729eacba606feaf324d47338a8dd6da6a17
	    //I am changing this file by inserting this output
	    System.out.println("from main branch");
		System.out.println("add from github");
	    //IN Feature Branch Right Now 
	    String c="Jello in feature branch";
	    System.out.println(c);
	    String message = "Gello";
        System.out.println( "Hello World!" );
        LOG.debug("it will debug");
        LOG.error("Error printed");
        LOG.info("This gives us information");
        LOG.warn("Warning Warning!!!");
        //LOG.always();
        
        double x1=9,x2=8,y1=7,y2=4;
        double x = x2-x1;
        double y=y2-y1;
        double xx=Math.pow(x, 2);
        double yy=Math.pow(y, 2);
        double lengthXY= Math.sqrt(xx+yy);
        double a1=10,a2=18,b1=3,b2=14;
        double a = a2-a1;
        double b=b2-b1;
        double aa=Math.pow(a, 2);
        double bb=Math.pow(b, 2);
        double lengthAB= Math.sqrt(aa+bb);
        System.out.println("length of line XY "+lengthXY+" length of line AB"  +lengthAB);
        if ( lengthAB > lengthXY) {
        	System.out.println("lengthAB is greater than lengthXY");
        }
        else if (lengthAB < lengthXY ) {
        	System.out.println("lengthAB is smaller than lengthXY");
        }
        else {
        	System.out.println("both are equal");
        }
        
    }
}
