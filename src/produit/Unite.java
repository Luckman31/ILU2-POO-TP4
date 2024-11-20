package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("pi�ce");


	private String unite;

	Unite(String unite) {
		this.unite=unite;
	}
	@Override
	public String toString() {
		return unite;
	}
}
