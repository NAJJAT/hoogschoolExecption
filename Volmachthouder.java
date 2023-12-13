
public class Volmachthouder extends Persoon {

	public Volmachthouder(String voornaam, String achternaam) {
		super(voornaam, achternaam);
	}

	@Override
	public boolean equals(Object obj) {
		// De klasse Persoon zijn equals methode kijkt al of Personen gelijk zijn op basis van hun achternaam
		// Hierdoor kunnen we de methode van de klasse Persoon oproepen via super!
		return super.equals(obj);
	}
}
