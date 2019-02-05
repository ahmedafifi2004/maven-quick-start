package adlsa.programming;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	


	public String hello(String greeting) {
                 return "Hello " + greeting;
             }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		
    	System.out.println ("Starting Application");
	Application app =new Application();
	String msg=app.hello("Ahmed Afifi");
		System.out.println (msg);
		System.out.println ("Finishing Application");
    }
}