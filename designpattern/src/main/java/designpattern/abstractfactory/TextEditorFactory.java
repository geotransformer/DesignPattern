package designpattern.abstractfactory;

public class TextEditorFactory extends AppFactory {

	@Override
	protected App getApp() {
		// TODO Auto-generated method stub
		return new TextEditor();
	}

	@Override
	protected Markup getMarkup() {
		// TODO Auto-generated method stub
		return new VimMarkup();
	}

}
