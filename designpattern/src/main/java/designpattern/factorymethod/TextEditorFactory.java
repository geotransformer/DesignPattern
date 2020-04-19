package designpattern.factorymethod;

public class TextEditorFactory extends AppFactory {

	@Override
	protected App getApp() {
		// TODO Auto-generated method stub
		return new TextEditor();
	}

}
