/**
 *
 */
public class TypeCastTest {

  private byte byteVariable;
  private short shortVariable;
  private int intVariable;
  private long longVariable;

  private float floatVariable;
  private double doubleVariable;

  private char charVariable;
  private boolean booleanVariable;

  public void initialisiereAlles() {
    byteVariable = 123;
    shortVariable = 1234;
    intVariable = 12345;
    longVariable = 123456;

    floatVariable = 123.456f;
    doubleVariable = 123.456;

    charVariable = 'A';
    booleanVariable = true;
  }

  public void variablenZuweisungen() {
    byteVariable = (byte)longVariable; // hier darf man typecasten oder auskommentieren
    byteVariable = (byte)charVariable; // hier darf man typecasten oder auskommentieren
    charVariable = (char)floatVariable; // hier darf man typecasten oder auskommentieren
    //booleanVariable = byteVariable; // hier darf man typecasten oder auskommentieren
  }

  public void methodenAufrufe() {
  // longVariable = addiere(floatVariable,doubleVariable); // hier darf man typecasten oder auskommentieren
  //doubleVariable = addiere(longVariable, charVariable); // hier darf man typecasten oder auskommentieren
  //  byteVariable = multipliziere(doubleVariable, charVariable); // hier darf man typecasten oder auskommentieren
  //  charVariable = mulitpliziere(booleanVariable, charVariable); // hier darf man typecasten oder auskommentieren
  }

  public double addiere(int zahl1, float zahl2) {
    return zahl1 + zahl2; // hier darf man typecasten oder auskommentieren
  }

  //public byte multipliziere(long zahl1, char zahl2) {
    //return (char)zahl1 * zahl2; // hier darf man typecasten oder auskommentieren
  //}
}
