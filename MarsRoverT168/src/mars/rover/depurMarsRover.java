package mars.rover;

import java.util.Scanner;

public class depurMarsRover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rover rover = new Rover('E',3,3);
		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
		
//		System.out.println("Left");
//		rover.left();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		System.out.println("Left");
//		rover.left();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		System.out.println("Left");
//		rover.left();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		System.out.println("Right");
//		rover.right();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		System.out.println("Move");
//		rover.move();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		System.out.println("Move");
//		rover.move();
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
//		
//		System.out.println("Command");
//		rover.command('R');
//		System.out.println(rover.getCardinalPoint()+" "+rover.getCoordX()+" "+rover.getCoordY());
//		
		
		
		//String str ="LMLMLMLMM";
		String str ="MMRMMRMRRM";
		
		Scanner s = new Scanner(str);
		
		String strCommand = s.nextLine();
		for(int i = 0; i < strCommand.length(); i++) {
		  //System.out.println(nome.charAt(i));
			
			rover.command(strCommand.charAt(i));
			System.out.println("Comando: "+strCommand.charAt(i));
		}
		System.out.println(rover.getCoordX()+" "+rover.getCoordY()+" "+rover.getCardinalPoint());
		
		
		
	}
	
	
//	string.toUpperCase()
//	string.toLowerCase()
//	Scanner s = new Scanner(System.in);
//	String nome = s.nextLine();
//	for(int i = 0; i < nome.length(); i++) {
//	  System.out.println(nome.charAt(i));
//	}

}
