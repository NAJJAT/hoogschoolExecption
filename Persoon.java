public class Persoon {

	private String voornaam;
	private String achternaam;
	private String telefoon;
	private Adres adres;

	private static int aantalPersonen = 0;

	// private constructor! Niet aanroepbaar door gebruikers, wel met this aanroepbaar in eigen klasse
	private Persoon() {
		aantalPersonen += 1;
	}

	public Persoon(String voornaam, String achternaam) {
		this();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}

	public static int getAantalPersonen() {
		return aantalPersonen;
	}

	protected static void setAantalPersonen(int aantalPersonen) {
		Persoon.aantalPersonen = aantalPersonen;
	}


	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getTelefoon() {
		return telefoon;
	}

	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String toString() {
		return getClass().getSimpleName()+ ": " + getVoornaam() + " " + getAchternaam();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}

		Persoon persoon = (Persoon) obj;

		return (persoon.getAchternaam().equals(this.achternaam));

	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = 37 * hash + this.voornaam.hashCode();
		hash = 37 * hash + this.achternaam.hashCode();
		return hash;
	}
}
