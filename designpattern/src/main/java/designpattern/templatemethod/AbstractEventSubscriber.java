package designpattern.templatemethod;

public abstract class AbstractEventSubscriber implements IEventSubscriber {

	//Template method with pre-defined algorithm
	@Override
	public final void process() {
		if (validate()) {			
			persist();
			accept();
		} else {
			reject();
		}
	}	
	
}
