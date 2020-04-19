package designpattern.state;

public class LightOffState implements LightState {

	@Override
	public boolean turnOn(Context context) {
		System.out.println("trun on the light");		
		context.transitState(LightStateContext.ON);
		return true;
	}

	@Override
	public boolean turnOff(Context context) {
		System.out.println("Already off. Do nothing");
		return true;
	}

	

}
