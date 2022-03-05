package model;

public class DryConverter {

	private int ounces;
	private int bushels;
	private int pecks;
	private int gallons;
	private int quarts;
	private int pints;
	private int cups;
	private int tablespoons;
	private int teaspoons;
	private int drops;
	private int pinches;
	private int dashes;

	// Constructors
	public DryConverter() {
		super();
	}

	public DryConverter(int ounces) {
		super();
		this.ounces = ounces;
		setMeasures(ounces); // Notice method call
	}

	public void setOunces(int ounces) {
		this.ounces = ounces;
		setMeasures(ounces); // Notice method call
	}
	

	// OTHER GETTERS AND SETTERS FOR INSTANCE VARIABLES
	// they are not modified

	public int getBushels() {
		return bushels;
	}

	public void setBushels(int bushels) {
		this.bushels = bushels;
	}

	public int getPecks() {
		return pecks;
	}

	public void setPecks(int pecks) {
		this.pecks = pecks;
	}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}

	public int getQuarts() {
		return quarts;
	}

	public void setQuarts(int quarts) {
		this.quarts = quarts;
	}

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

	public int getDrops() {
		return drops;
	}

	public void setDrops(int drops) {
		this.drops = drops;
	}

	public int getPinches() {
		return pinches;
	}

	public void setPinches(int pinches) {
		this.pinches = pinches;
	}

	public int getDashes() {
		return dashes;
	}

	public void setDashes(int dashes) {
		this.dashes = dashes;
	}

	public int getOunces() {
		return ounces;
	}

	public void setMeasures(int ounces) {
		final int BUSHELS = 1024; //Number of ounces in a bushel
		final int PECKS = 256; //Number of ounces in a peck
		final int GALLONS = 128;  //Number of ounces in a gallon
		final int QUARTS = 32; // Number of ounces in a quart
		final int PINTS = 16;  //Number of ounces in a pint
		final int CUPS = 8;  //Approximate number of ounces in a cup
		final int TABLESPOONS = 2; // Number of tablespoons in an ounce
		final int TEASPOONS = 6; // Number of teaspoons in an ounce
		final int DROPS = 10; //Number of drops in an ounce
		final int PINCHES = 48; //Number of pinches in an ounce
		final int DASHES = 96; //Number of dashes in an ounce
		
		
		int ouncesLeft;
		
		setBushels(ounces / BUSHELS);
		ouncesLeft = ounces % BUSHELS;
		
		setPecks(ouncesLeft / PECKS);
		ouncesLeft = ouncesLeft % PECKS;
		
		setGallons(ouncesLeft / GALLONS);
		ouncesLeft = ouncesLeft % GALLONS;
		
		setQuarts(ouncesLeft / QUARTS);
		ouncesLeft = ouncesLeft % QUARTS;
		
		setPints(ouncesLeft / PINTS);
		ouncesLeft = ouncesLeft % PINTS;
		
		setCups(ouncesLeft / CUPS);
		ouncesLeft = ouncesLeft % CUPS;
		
		setTablespoons(ouncesLeft * TABLESPOONS);
		
		setTeaspoons(ouncesLeft * TEASPOONS);
		
		setDrops(ouncesLeft * DROPS);
		
		setPinches(ouncesLeft * PINCHES);
		
		setDashes(ouncesLeft * DASHES);
	}
	
}
