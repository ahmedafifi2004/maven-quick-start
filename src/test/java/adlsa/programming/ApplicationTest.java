package adlsa.programming;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordMatchString() {
      //  int count = app.countWords("this is a test");
		String msg=app.hello("Ahmed Afifi");
        assertTrue(msg.equals("Hello Ahmed Afifi"));
    }
	
	 @Test
    public void testWordUnMatchString() {
      //  int count = app.countWords("this is a test");
		String msg=app.hello("My Friend");
        assertTrue(msg.equals("Hello Friend"));
    }

 @Test
 @Ignore
    public void testWordIgnoreString() {
      //  int count = app.countWords("this is a test");
	  
		String msg=app.hello("My Friend");
        assertTrue(msg.equals("Hello Friend"));
    }

}