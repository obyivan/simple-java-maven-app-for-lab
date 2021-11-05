package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{	
    private final String message = "Hello World!"; // This is a trailing comment that can be very very long

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

    public void infiniteLoopUsingDoWhile() {
    do {
         System.out.println("Running while loop");
    	} while (true);
    }
}

    class HelloWorld {
	public static void main(String[] args){
			System.out.println("Hello world"); // This is a trailing comment that can be very very long
		}
	}

