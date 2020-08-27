//Aufgabe 1b Kapselung
public class Tier { 		//Superklasse Tier

	private int gewicht; // private Instanzvariablen
	private int groesse;
	private int alter;
	private String farbe; 
	private String land; 
	private String name;
	
	public void setName(String n) { //setter
		name = n; 
	}
	public String getName() { //getter
		return name;
	}
	public void setLand(String l) {
		land = l; 
	}
	public String getLand() { 
		return land;
	}
	public void setFarbe(String f) {
		farbe = f; 
	}
	public String getFarbe() {
		return farbe;
	}
	public void setAlter(int a) {
		alter = a; 
	}
	public int getAlter() {
		return alter; 
	}
	public void setGroesse(int g) {
		groesse = g;
	}
	public int getGroesse () {
		return groesse;
	}
	public void setGewicht (int ge) {
		gewicht = ge;
	}
	public int getGewicht () { 
		return gewicht; 
	}
	
		public void erzaehlWas() {				//Methode erzaehlWas
			System.out.println("Mein Name ist " + name); 
			System.out.println("Ich komme aus " + land);
			System.out.println("Mein Fell ist " + farbe);
			System.out.println("Mein alter ist " + alter + " Jahre");
			System.out.println("Meine Groesse betraegt " + groesse +" m");
			System.out.println("Mein Gewicht betraegt " + gewicht + " kg");
		}
}