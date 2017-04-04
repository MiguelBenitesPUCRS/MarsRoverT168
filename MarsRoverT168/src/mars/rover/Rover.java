//Rover ::
//Conventions: N=North (Norte), S=South (Sul), E=East (Leste), W=West (Oeste) 

package mars.rover;

public class Rover {
	
	private static int roverSeq=0;
	
	private int id;				//identification of rover
	private int coordX;			//coordinate axial X
	private int coordY;			//coordinate axial Y
	private String name;		//rover's name 
	private char cardinalPoint;	//the direction of rover
	
	public Rover(char cardinalPoint) {
		this.id = roverSeq++;
		this.cardinalPoint = cardinalPoint;
		this.name = "Opportunity";
		this.coordX = 0;
		this.coordY = 0;
	}
	
	public Rover(char cardinalPoint, int x, int y) {
		this.id = roverSeq++;
		this.cardinalPoint = cardinalPoint;
		this.name = "Opportunity";
		this.coordX = x;
		this.coordY = y;
	}

	public Rover(String name, char cardinalPoint, int x, int y) {
		this.id = roverSeq++;
		this.cardinalPoint = cardinalPoint;
		this.name = name;
		this.coordX = x;
		this.coordY = y;
	}

	public char getCardinalPoint() {
		return cardinalPoint;
	}

	private void setCardinalPoint(char cardinalP) {
		this.cardinalPoint = cardinalP;
	}
	
	public int getCoordX() {
		return coordX;
	}

	private void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	private void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public static int getRoverSeq() {
		return roverSeq;
	}

	//N=North (Norte), S=South (Sul), E=East (Leste), W=West (Oeste) 
	public void left(){
		switch (cardinalPoint){
		case 'N':
			setCardinalPoint('W');
			break;
		case 'W':
			setCardinalPoint('S');
			break;
		case 'S':
			setCardinalPoint('E');
			break;
		case 'E':
			setCardinalPoint('N');
			break;
		}
	}
	
	//N=North (Norte), S=South (Sul), E=East (Leste), W=West (Oeste) 
	public void right(){
		switch (cardinalPoint){
		case 'N':
			setCardinalPoint('E');
			break;
		case 'E':
			setCardinalPoint('S');
			break;
		case 'S':
			setCardinalPoint('W');
			break;
		case 'W':
			setCardinalPoint('N');
			break;
		}
	}
		
	//N=North (Norte), S=South (Sul), E=East (Leste), W=West (Oeste) 
	public void move(){
		switch (cardinalPoint){
		case 'N':
			setCoordY(coordY+1);
			break;
		case 'S':
			setCoordY(coordY-1);
			break;		
		case 'E':
			setCoordX(coordX+1);
			break;
		case 'W':
			setCoordX(coordX-1);
			break;
		}					
	}
	
	public void command(char comm){
		switch (comm){
		case 'L':
			left();		//turn to left
			break;
		case 'R':
			right();	//turn to right
			break;
		case 'M':
			move();		//move to straight
			break;
		}
	}
	
}

