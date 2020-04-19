package designpattern.state;

public interface LightState {
	public boolean turnOn(Context context);
	public boolean turnOff(Context context);
}
