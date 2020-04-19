package designpattern.factorymethod;

public class WordProcessorFactory extends AppFactory {

	@Override
	protected App getApp() {
		// TODO Auto-generated method stub
		return new WordProcessor();
	}

}
