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
        
    }
}
