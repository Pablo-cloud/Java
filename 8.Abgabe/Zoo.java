/**
 * Der Zoo erstellt alle noetigen Tiere und enthaelt die Hauptschleife des Programms
 */
import java.util.Arrays;
import java.util.ArrayList;

public class Zoo {
  // Haupt-Methode des Programms
  public void losGehts() {
    // Benutzeringabe deklarieren und initalisieren
    Benutzereingabe eingabe = new Benutzereingabe();

	
	ArrayList<Tier> alleTiere= new ArrayList<Tier>();
	
    Affe affe = new Affe();
    affe.initialisieren("Mr Affington", 3, 12.5f, "Mexiko", false);
    //alleTiere[0] = affe;
	alleTiere.add(affe); // Objekt in ArrayList addieren

    Loewe loewe = new Loewe();
    loewe.initialisieren("Rooaaarnald", 5, 25.5f, "Tansania", true);
    //alleTiere[1] = loewe;
    alleTiere.add(loewe);// Objekt in ArrayList addieren
	
	
    Erdmaennchen erdmaennchen = new Erdmaennchen();
    erdmaennchen.initialisieren("Peter", 2, 2.25f, "Tansania", false);
    //alleTiere[2] = erdmaennchen;
	alleTiere.add(erdmaennchen);// Objekt in ArrayList addieren

    Hase hase = new Hase();
    hase.initialisieren("Bluemchen", 1, 3.0f, "Deutschland", false);
    //alleTiere[3] = hase;
	alleTiere.add(hase);// Objekt in ArrayList addieren

    Giraffe giraffe = new Giraffe();
    giraffe.initialisieren("Guenther", 3, 200.2f, "Tansania", false);
    //alleTiere[4] = giraffe;
    alleTiere.add(giraffe);// Objekt in ArrayList addieren

    Baer baer = new Baer();
    baer.initialisieren("Benjamin", 5, 643.4f, "Russland", true);
    //alleTiere[5] = baer;
	alleTiere.add(baer);// Objekt in ArrayList addieren
	

    // Schleife fuer die Abfrage der Benutzereingabe
    boolean ende = false;
    while (!ende) {
      String eingabeText1 = eingabe.getBenutzereingabe("Wollen Sie beruehren oder hinzufuegen?");
	  

	  
	  if (eingabeText1.equalsIgnoreCase("beruehren")){ // equalsIgnoreCase() wird benutzt damit beim Einlesen der Eingabe die Groß- und
                                                           //Kleinschreibung ignorieren werden
		  String eingabeText = eingabe.getBenutzereingabe("Wollen Sie was über die Pflanzenfresser oder die Fleischfresser lesen, oder einzelne Tiere. Falls einzelne Tiere, Tiernamen eingeben. Sonst Pflanzenfresser oder Fleischfresser?");
		 
		 
		 
		for (Tier tier : alleTiere) { // Für einzelne Tiere
			
			if(eingabeText.equalsIgnoreCase(tier.getNameTierart())){
	            tier.erzaehlWas();
	            tier.geraeuschMachen();
			}
			
        if (eingabeText.equalsIgnoreCase("Pflanzenfresser")) { //Alle die Pflanzfresser werden gezeigt
		  if(tier.getNameTierart().equalsIgnoreCase("Affe")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           }
		  if(tier.getNameTierart().equalsIgnoreCase("Baer")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           }
          if(tier.getNameTierart().equalsIgnoreCase("Giraffe")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           } 
          if(tier.getNameTierart().equalsIgnoreCase("Hase")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           } 		   
        }  
		
		if (eingabeText.equalsIgnoreCase("Fleischfresser")){ //Alle die Fleischfresser werden gezeigt
		  if(tier.getNameTierart().equalsIgnoreCase("Affe")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           }
		  if(tier.getNameTierart().equalsIgnoreCase("Baer")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           }
          if(tier.getNameTierart().equalsIgnoreCase("Erdmaennchen")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           } 
          if(tier.getNameTierart().equalsIgnoreCase("Loewe")){
		  tier.erzaehlWas();
          tier.geraeuschMachen();
           } 		   
        
	     }
        }
	  }
	  
	  if (eingabeText1.equalsIgnoreCase("hinzufuegen")){
		  
		  //Eingabe alle die Daten die wir brauchen, um ein neues Tier zu addieren
		  String tierArt = eingabe.getBenutzereingabe("Welche Tierart moechten Sie hinzufuegen?");
		  String tierName = eingabe.getBenutzereingabe("Wie heisst das Tier?");
		  String tieralter = eingabe.getBenutzereingabe("Wie alt ist das Tier?");
		  int alter= Integer.parseInt(tieralter);
		  String tierGewicht = eingabe.getBenutzereingabe("Wie schwer ist das Tier?");
	      float gewicht= Float.parseFloat(tierGewicht);
		  String tierLand = eingabe.getBenutzereingabe("Wo kommt das Tier her?");
		  String tierGefaehrlich=eingabe.getBenutzereingabe("Ist das Tier gefaehrlich?");
		  boolean gefaehrlich = Boolean.parseBoolean(tierGefaehrlich);
		  
		  if(tierArt.equalsIgnoreCase("Affe")){ //Wenn das Tier ein Affe ist wird das Objekt als eine Klasse Affe erstellt
			  Affe neueAffe= new Affe();
			  neueAffe.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueAffe); //Addierungs des Tier-Objekts in ArrayList
			  //neueAffe.knochenZerbeissen(); Testen der Methode knochenZerbeissen
		  }
		  
		  if(tierArt.equalsIgnoreCase("Baer")){//Wenn das Tier ein Baer ist wird das Objekt als eine Klasse Baer erstellt
			  Baer neueBaer= new Baer();
			  neueBaer.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueBaer);//Addierungs des Tier-Objekts in ArrayList
		  }
		  
		  if(tierArt.equalsIgnoreCase("Erdmaennchen")){//Wenn das Tier ein Erdmaennchen ist wird das Objekt als eine Klasse Erdmaennchen erstellt
			  Erdmaennchen neueErdmaennchen= new Erdmaennchen();
			  neueErdmaennchen.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueErdmaennchen);//Addierungs des Tier-Objekts in ArrayList
		  }
		  
		  if(tierArt.equalsIgnoreCase("Giraffe")){//Wenn das Tier eine Giraffe ist wird das Objekt als eine Klasse Giraffe erstellt
			  Giraffe neueGiraffe= new Giraffe();
			  neueGiraffe.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueGiraffe);//Addierungs des Tier-Objekts in ArrayList
		  }
		  
		  if(tierArt.equalsIgnoreCase("Hase")){//Wenn das Tier ein Hase ist wird das Objekt als eine Klasse Hase erstellt
			  Hase neueHase= new Hase();
			  neueHase.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueHase);//Addierungs des Tier-Objekts in ArrayList
		  }
		  
		  if(tierArt.equalsIgnoreCase("Loewe")){//Wenn das Tier ein Loewe ist wird das Objekt als eine Klasse Loewe erstellt
			  Loewe neueLoewe= new Loewe();
			  neueLoewe.initialisieren(tierName,alter,gewicht,tierLand,gefaehrlich);
	          alleTiere.add(neueLoewe);//Addierungs des Tier-Objekts in ArrayList
		  }
		  
	  }
	  

      if (eingabeText1.equalsIgnoreCase("ENDE")) {
        ende = true;
      }
    }
    System.out.println("Vielen Dank fuer Ihren Besuch im Zoo.");
  }
}