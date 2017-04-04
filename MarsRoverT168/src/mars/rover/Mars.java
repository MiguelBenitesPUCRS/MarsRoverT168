package mars.rover;


public class Mars {

	public static void main(String[] args) {
		Plateau plateau = new Plateau();
		Rover rover = new Rover('N');
		
		plateau.insertRover(rover, 1, 2);
		
		
	}

}