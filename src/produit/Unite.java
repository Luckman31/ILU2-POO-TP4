package produit;

public enum Unite {
	GRAMME("g"), KILOGRAMME("kg"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("pi�ce");

	private String unitee;

	Unite(String unitee) {
		this.unitee = unitee;
	}

	@Override
	public String toString() {
		return unitee;
	}
}
