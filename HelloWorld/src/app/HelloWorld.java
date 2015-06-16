package app;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Git World");
		int detectedDup = DupDetector.findDuplicateValue();
		System.out.println("Detected duplicate value:"+detectedDup);
	}
}
