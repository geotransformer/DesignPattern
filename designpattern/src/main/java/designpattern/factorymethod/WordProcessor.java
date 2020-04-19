package designpattern.factorymethod;

public class WordProcessor implements App {

	@Override
	public void open(String filePath) {
		System.out.println("WordProcessor: Process word doc using the word processor - " + filePath);
	}

}
