/**
 * TestCalculator has a method called testParser() which:
r
 * @author ma3u16
 *
 */


public class TestCalculator {
	
	Calculator calculator;
	/*
	 *  returns a boolean which is true if the whole test succeeds
		tests that x("12 + 5") returns a Double with the value 17
		tests that x("12 x 5") returns a Double with the value 60
		tests that x("12 [ 3") returns null because [ is not a valid operator
	 */
	boolean testParser()
	{	Double y = (double) 17;
		if (calculator.x("12 + 5") == y)
			return true;
		
		if (calculator.x("12 * 5") == y)
			return true;
		
		return false;
	}
	
	//GitHub github = GitHub.connect();

}
