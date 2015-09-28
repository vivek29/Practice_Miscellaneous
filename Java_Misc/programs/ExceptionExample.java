package com.practice.vivek;

// We can have our own custom Exception handler to deal with special exception conditions
// instead of using existing exception classes. Custom exceptions usually extend the Exception
// class directly or any subclass of Exception (making it checked).
// The super() call can be used to set a detail message in the throwable. Below is an example
// that shows the use of Custom exception’s along with how the throw and throws clause are used.


class BadTemperature extends Exception{
	BadTemperature( String reason ){
		super ( reason );
    }
}

class TooHot extends BadTemperature{

	TooHot(){
		super ("Default message : Hot");
    }

	TooHot(String message){
		super (message);
    }
}

class TooCold extends BadTemperature{ 

	TooCold(){
		super ("Default message : Cold");
    }

	TooCold(String message){
		super (message);
    }
}

class TempertureObject{ 

	int temperature;

    TempertureObject( int temp ) {
    	temperature = temp;
    }

    void test() throws TooHot, TooCold {
    	if ( temperature < 70 ) throw new TooCold("Very Cold");
        if ( temperature > 80 ) throw new TooHot("Very Hot");
    }
}

public class ExceptionExample{   

	private static void temperatureReport( TempertureObject batch ){
		try{   batch.test();
            System.out.println( "Perfect Temperature" );
        }
        catch ( BadTemperature bt ){
        	System.out.println( bt.getMessage( ) );
        }
    }

    public static void main( String[] args ){
    	temperatureReport( new TempertureObject( 100 ) );
        temperatureReport( new TempertureObject( 50 ) );
        temperatureReport( new TempertureObject( 75 ) );
    }
}
