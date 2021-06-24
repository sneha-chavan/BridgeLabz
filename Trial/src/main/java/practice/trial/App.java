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
    	String message = "Gello";
        System.out.println( "Hello World!" );
        LOG.debug("it will debug");
        LOG.error("Error printed");
        LOG.info("This gives us information");
        LOG.warn("Warning Warning!!!");
        //LOG.always();
        
    }
}
