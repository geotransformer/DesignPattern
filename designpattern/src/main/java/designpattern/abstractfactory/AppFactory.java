package designpattern.abstractfactory;

/**
 * Intent
 * Define an interface for creating an object, but let the subclass decide
 * which class to instantiate. Factory method lets a class defer instantiation to subclass
 *
 */
public abstract class AppFactory {
	
	public App getAppInstance() {
		return getApp();
	}
	protected abstract App getApp();	
	
	public Markup getMarkupInstance() {
		return getMarkup();
	}
	protected abstract Markup getMarkup();	


}
