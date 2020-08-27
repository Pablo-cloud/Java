/**
 * Die Klasse Affe erbt von Tier
 */
public final class Affe extends Tier implements Fleischfresser, Pflanzenfresser {

	public void knochenZerbeissen() {
		System.out.println("Ich habe meiner Art gerecht verdaut!");
	}
	public void pflanzenZerkauen() {
			System.out.println("Ich habe meiner Art gerecht verdaut!");
		}
	
  // Methode aus Tier ueberschrieben
  public void erzaehlWas() {
    // Das Gleiche was jedes Tier sagt.
    super.erzaehlWas();

    // Zusaetzliche Aussage des Affen
    System.out.println("Affen sind einfach die besten Tiere.");
  }

  // Methode aus Tier ueberschrieben
  public void geraeuschMachen() {
    System.out.println("BRUELL");
  }

  // Diese Methode ist ueberladen, weil die Menge und Art der Parameter geaendert wurde
  public void initialisieren(String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    // deshalb kann man hier auch ohne super arbeiten
    initialisieren("Affe", neuerName, neuesAlter, neuesGewicht, neuesUrsprungsland, neuGefaehrlich);
  }
}
