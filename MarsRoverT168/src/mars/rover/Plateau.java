package mars.rover;

public class Plateau {

	Rover[][] plateau; 
	
	public Plateau() {
		plateau = new Rover[0][0];
	}
	
	public Plateau(int x, int y) {
		plateau = new Rover[x][y];
	}

	public void insertRover(Rover rover, int x, int y){
		plateau[x][y] = rover;
	}
	
	public Rover returnRover(int x, int y){
		return plateau[x][y];
	}
	
	public void removeRover(int x, int y){
		plateau[x][y] = null;
	}
	
	public void removeRover(Rover rover){
		
	}
	
	public boolean isEmpty(int x, int y){
		if (plateau[x][y].equals(null)){
			return true;
		}
		return false;
	}
	
			
}