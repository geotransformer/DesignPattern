package designpattern.templatemethod;

public interface IEventSubscriber {
	public void subscribe();
	public void process();
	public boolean validate();
	public void persist();
	public void accept();
	public void reject();
}
