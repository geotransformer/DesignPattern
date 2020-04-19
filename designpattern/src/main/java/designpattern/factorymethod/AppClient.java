package designpattern.factorymethod;

public class AppClient {

	public static void main(String[] args) {
		AppFactory appFactory = new WordProcessorFactory();
		App app = appFactory.getAppInstance();
		app.open("/Users/Emily/daycare/applicaion.docx");
		
		app = new TextEditorFactory().getAppInstance();
		
		app.open("/Users/Emily/daycare/README.md");

	}

}
