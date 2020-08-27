//pablo ender, 17.01.2020


import java.io.*;

public class Kontakte{
	private String vorname;
	private String nachname;
	private String telefonnummer;
	
	public Kontakte (String v, String n, String t){ //Konstruktor
		vorname = v;
		nachname = n;
		telefonnummer = t;
	}
	
	public void setVorname(String derVorname){ //setter Vorname
		vorname = derVorname;
	}
	
	public String getVorname(){ //getter Vorname
		return vorname;
	}
	
	public void setNachname(String derNachname){
		nachname=derNachname;
	}
	public String getNachname(){
		return nachname;
	}
	public void setTelefonnummer(String dieTelefonnummer){
		telefonnummer=dieTelefonnummer;
	}
	public String getTelefonnummer(){
		return telefonnummer;
	}
}