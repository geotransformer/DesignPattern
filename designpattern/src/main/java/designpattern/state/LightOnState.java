package designpattern.state;

public class LightOnState implements LightState  {

	@Override
	public boolean turnOn(Context context) {
		System.out.println("Already on. Do nothing");
		return true;
		
	}

	@Override
	public boolean turnOff(Context context) {
		System.out.println("trun off the light");
		context.transitState(LightStateContext.OFF);
		return true;
	}

	

}
