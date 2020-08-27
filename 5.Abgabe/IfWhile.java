public class IfWhile{

	public static void main (String [] args) {
	
		int x = 0;
		
		while (x<=10) { //Beginn Wihle-Schleife
			x = x + 1;
			if ( x==2 || x==3 || x==5 || x==7 ) {  // bool´sche Ausdrücke
				System.out.println( x + " ist eine Primzahl" );
			}
			else {
				System.out.println( x + " ist keine Primzahl" );	
			}
		}
	}
}


	
