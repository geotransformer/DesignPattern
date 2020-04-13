package designpattern.templatemethod;

public class RoomEventSubscriber extends AbstractEventSubscriber {

	@Override
	public void subscribe() {
		System.out.println("Subcribe to room event in hotel");
		process();

	}

	@Override
	public boolean validate() {
		// return true if it is a room event and valid
		return false;
	}

	@Override
	public void persist() {
		// persist the room event to postgresql DB
		System.out.println("Room event saved in to the postgresql db");
	}

	@Override
	public void accept() {
		// Notify room event accepted 
		System.out.println("Room event accepted");
	}

	@Override
	public void reject() {
		// Notify room event rejected 
		System.out.println("Room event rejected");
	}

}
