package designpattern.factorymethod;

public class TextEditor implements App {

	@Override
	public void open(String filePath) {
		System.out.println("TextEditor: Open text file using the text editor - " + filePath);
	}

}
