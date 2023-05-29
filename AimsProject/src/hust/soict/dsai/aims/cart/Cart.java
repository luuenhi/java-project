
public class Cart {
	
    public static final int MAX_NUMBERS_ORDERED = 20;
    public static void main(String[] args) { 
	Cart anOrder = new Cart();
	
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
			"Animation", "Rogert Allers", 87, 19.95f);
	anOrder.DigitalVideoDisc(dvd1);
	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
	anOrder.DigitalVideoDisc(dvd2);
	
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
	anOrder.DigitalVideoDisc(dvd3);
	
	System.out.println("Total Cost is:");
	System.out.println(anOrder.totalCost());
	
	
	
}
private char[] totalCost() {
	return null;
}
private void DigitalVideoDisc(DigitalVideoDisc dvd1) {
}
}


	