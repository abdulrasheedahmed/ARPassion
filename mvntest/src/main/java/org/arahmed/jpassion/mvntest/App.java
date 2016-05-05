package org.arahmed.jpassion.mvntest;

import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */

final class App 
{
	private App(){
	};

	private static final Logger logger = LogManager.getLogger(App.class.getName());
	
    public static void main(String[] args)
    {
        
    	logger.error("Hello World!");
    }
}
