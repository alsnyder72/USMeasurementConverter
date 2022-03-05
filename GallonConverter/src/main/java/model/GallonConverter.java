package model;

public class GallonConverter {
	
	private int ounces;
	private int gallons;
	private int quarts;
	private int pints;
	private int cups;
	private int tablespoons;
	private int teaspoons;
	
	//Constructors
	public GallonConverter() {
		super();
	}

	public GallonConverter(int ounces) {
		super();
		this.ounces = ounces;
		setMeasures(ounces);      // Notice method call
	}
	
	public void setOunces(int ounces) {
		this.ounces = ounces;
		setMeasures(ounces);     // Notice method call
	}
	
	//OTHER GETTERS AND SETTERS FOR INSTANCE VARIABLES
	//they are not modified

	public int getPints() {
		return pints;
	}

	public void setPints(int pints) {
		this.pints = pints;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
	}

	public int getQuarts() {
		return quarts;
	}

	public void setQuarts(int quarts) {
		this.quarts = quarts;
	}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}

	public int getTablespoons() {
		return tablespoons;
	}

	public void setTablespoons(int tablespoons) {
		this.tablespoons = tablespoons;
	}

	public int getTeaspoons() {
		return teaspoons;
	}

	public void setTeaspoons(int teaspoons) {
		this.teaspoons = teaspoons;
	}

	public int getOunces() {
		return ounces;
	}
	
	public void setMeasures(int ounces) {
		final int GALLONS = 128;  //Number of ounces in a gallon
		final int QUARTS = 32; // Number of ounces in a quart
		final int PINTS = 16;  //Number of ounces in a pint
		final int CUPS = 8;  //Approximate number of ounces in a cup
		final int TABLESPOONS = 2; // Number of tablespoons in an ounce
		final int TEASPOONS = 6; // Number of teaspoons in an ounce
		
		int ouncesLeft;
		
		setGallons(ounces / GALLONS);
		ouncesLeft = ounces % GALLONS;
		
		setQuarts(ouncesLeft / QUARTS);
		ouncesLeft = ouncesLeft % QUARTS;
		
		setPints(ouncesLeft / PINTS);
		ouncesLeft = ouncesLeft % PINTS;
		
		setCups(ouncesLeft / CUPS);
		ouncesLeft = ouncesLeft % CUPS;
		
		setTablespoons(ouncesLeft * TABLESPOONS);
		
		setTeaspoons(ouncesLeft * TEASPOONS);
	}

	@Override
	public String toString() {
		return "GallonConverter [ounces=" + ounces + ", gallons=" + gallons + ", quarts=" + quarts + ", pints=" + pints
				+ ", cups=" + cups + ", tablespoons=" + tablespoons + ", teaspoons=" + teaspoons + "]";
	}

}
