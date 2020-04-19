package designpattern.abstractfactory;

public class VimMarkup implements Markup {

	@Override
	public void applyMarkUp() {
		System.out.println("VimMarkup: Apply vim makrup to editor");
	}

}
