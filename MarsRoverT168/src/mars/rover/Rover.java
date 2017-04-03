package mars.rover;

public class Rover {
	
	private int coordX;
	private int coordY;
	private char cardinalPoint;
	
	public Rover(char cardinalPoint) {
		this.cardinalPoint = cardinalPoint;
		this.coordX = 0;
		this.coordY = 0;
	}
	
	public Rover(char cardinalPoint, int x, int y) {
		this.cardinalPoint = cardinalPoint;
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

	public void left(){
		switch (cardinalPoint){
		case 'N':
			setCardinalPoint('O');
			break;
		case 'O':
			setCardinalPoint('S');
			break;
		case 'S':
			setCardinalPoint('L');
			break;
		case 'L':
			setCardinalPoint('N');
			break;
		}
	}
	
	public void right(){
		switch (cardinalPoint){
		case 'N':
			setCardinalPoint('L');
			break;
		case 'L':
			setCardinalPoint('S');
			break;
		case 'S':
			setCardinalPoint('O');
			break;
		case 'O':
			setCardinalPoint('N');
			break;
		}
	}
		
	public void move(){
		switch (cardinalPoint){
		case 'N':
			setCoordY(coordY+1);
			break;
		case 'S':
			setCoordY(coordY-1);
			break;		
		case 'L':
			setCoordX(coordX+1);
			break;
		case 'O':
			setCoordX(coordX-1);
			break;
		}
					
	}
	
	public void command(char comm){
		switch (comm){
		case 'L':
			left();
			break;
		case 'R':
			right();
			break;
		case 'M':
			move();
			break;
		}
	}
}

