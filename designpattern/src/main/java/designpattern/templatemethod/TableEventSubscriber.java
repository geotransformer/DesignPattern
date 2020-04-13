package designpattern.templatemethod;

public class TableEventSubscriber extends AbstractEventSubscriber {

	@Override
	public void subscribe() {
		// init table reservation event subscription
		System.out.println("Subcribe to table reservation event in hotel");
		process();

	}

	@Override
	public boolean validate() {
		// return true if it is a table reservation event and valid
		return false;
	}

	@Override
	public void persist() {
		// persist the room event to mysql DB
		System.out.println("table reservation event saved in to the mysql db");
	}

	@Override
	public void accept() {
		// Notify table reservation accepted 
		System.out.println("table reservation event accepted");
	}

	@Override
	public void reject() {
		// Notify table reservation event rejected 
		System.out.println("table reservation event rejected");
	}

}
