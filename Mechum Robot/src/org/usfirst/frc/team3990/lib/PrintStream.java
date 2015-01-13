package org.usfirst.frc.team3990.lib;

public class PrintStream {
	
	  String prefix;
	    String suffix = " ";
	    
	    

	    /**
	     * Constructor
	     * @param prefix The string of text to append to the beginning of the stream
	     */
	    public PrintStream(String prefix) {
	        this.prefix = prefix;
	    }
	    
	    

	    /**
	     * Constructor
	     * @param prefix The string of text to append to the beginning of the stream
	     */
	    public PrintStream(String prefix, String suffix) {
	        this.prefix = prefix;
	        this.suffix = suffix;
	    }

	    /**
	     * Prints data with suffix and prefix
	     * @param data 
	     */
	    public void println(String data) {
	        System.out.println(prefix + data + suffix);
	    }
	    
	    public void print(String data)  {
	        System.out.print(data);
	    }
	}

