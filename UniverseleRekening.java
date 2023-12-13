public class UniverseleRekening {

	private Volmachthouder volmachthouder;

	public void toevoegenVolmacht(Volmachthouder volmachthouder) {
		this.volmachthouder = volmachthouder;
	}

	public boolean verwijderenVolmacht(Volmachthouder volmachthouder) throws PersoonHeeftGeenVolmachtException {
		if (volmachthouder != null && volmachthouder.equals(this.volmachthouder)) {
			this.volmachthouder = null;
			return true;
		} else {
			throw new PersoonHeeftGeenVolmachtException();
		}
	}

	public boolean controleerVolmacht(Volmachthouder volmachthouder) throws PersoonHeeftGeenVolmachtException {
		if (volmachthouder != null && volmachthouder.equals(this.volmachthouder)) {
			return true;
		} else {
			throw new PersoonHeeftGeenVolmachtException();
		}
	}
	public Volmachthouder getVolmachthouder() {
		return volmachthouder;
	}
}
