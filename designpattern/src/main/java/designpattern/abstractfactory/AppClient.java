package designpattern.abstractfactory;

public class AppClient {

	public static void main(String[] args) {
		AppFactory appFactory = new WordProcessorFactory();
		App app = appFactory.getAppInstance();
		Markup markup = appFactory.getMarkup();
		app.open("/Users/Emily/daycare/applicaion.docx");
		markup.applyMarkUp();
		
		appFactory = new TextEditorFactory();
		app = appFactory.getAppInstance();
		markup = appFactory.getMarkup();
		app.open("/Users/Emily/daycare/README.md");
		markup.applyMarkUp();
		
	}

}
