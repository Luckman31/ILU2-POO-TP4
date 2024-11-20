package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("pièce");


	private String unite;

	Unite(String unite) {
		this.unite=unite;
	}
	@Override
	public String toString() {
		return unite;
	}
}
