package designpattern.abstractfactory;

public class WordProcessorFactory extends AppFactory {

	@Override
	protected App getApp() {
		// TODO Auto-generated method stub
		return new WordProcessor();
	}

	@Override
	protected Markup getMarkup() {
		// TODO Auto-generated method stub
		return new WordMarkup();
	}

}
