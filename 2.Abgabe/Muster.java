// Pablo Ender, Maximilian Rallis
// 3.) Verschachtelte While schleifen

public class Muster 
{
	public static void main(String[] args)
	{
		int x=0; // Laufvariable
		while (x<5) // erste While verschachtelung
		{ 
		  int y=0;
		  while (y<4) // Zweite While Verschahtelung //Nur 4, weil nur 4 mal die Zeile gewechselt werden muss!
		  {
		    System.out.print("x"); 
		    y++; //y hochlaufen lassen
		  }
		  System.out.println("x");
		  x++; // x hochlaufen lassen
		}
	}
}