package produit;

public enum Unite {
	GRAMME("g"), KILOGRAMME("kg"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("pièce");

	private String unitee;

	Unite(String unitee) {
		this.unitee = unitee;
	}

	@Override
	public String toString() {
		return unitee;
	}
}
