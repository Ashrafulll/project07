package abstraction;

public class Brand extends Hardware implements Laptop {
	
	public void hp() {
		System.out.println("It hp brand Laptop");
	}

	
	public void usb() {
		System.out.println("its have 2 usb port");
		
		
	}

	public void start() {
		
	System.out.println("Every Laptop have a start button");
		
	}

	public void stop() {
	System.out.println("Every Laptop have a stop button");
		
	}

}
