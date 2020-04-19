package designpattern.state;

public class LightStateContext implements Context{
	
	/*
	 * Singleton state
	 */
    public static final LightState ON = new LightOnState();
    public static final LightState OFF = new LightOffState();
    
	private LightState state = OFF;

	public LightState getState() {
		return state;
	}

	public void setState(LightState state) {
		this.state = state;
	}
	
	@Override
	public boolean turnOn() {
		return state.turnOn(this);
	}
	@Override
	public boolean turnOff() {
		return state.turnOff(this);
	}	

	@Override
	public void transitState(LightState state) {
		this.state = state;
	}
	
	public static void main(String[] args) {
		LightStateContext context = new LightStateContext();
		
		context.turnOff();
		context.turnOn();
		context.turnOn();
		context.turnOff();
		context.turnOff();
		
	}


}
