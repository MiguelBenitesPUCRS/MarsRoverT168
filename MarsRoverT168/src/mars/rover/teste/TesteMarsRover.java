package mars.rover.teste;

import org.junit.Before;
import org.junit.Test;

import mars.rover.Rover;

public class TesteMarsRover {
	
	@Before
	public void setup(){
		Rover rover = new Rover('E',3,3);
	}
	
	@Test
	public void testReturnRoverCommand(){
		String str ="MMRMMRMRRM";
	}
	

}
