package designpattern.abstractfactory;

public class WordMarkup implements Markup {

	@Override
	public void applyMarkUp() {
		System.out.println("WordMarkup: apply the word mark up");
	}

}
