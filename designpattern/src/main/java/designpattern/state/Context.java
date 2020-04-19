package designpattern.state;

public interface Context {
	public boolean turnOn();
	public boolean turnOff();
	public void transitState(LightState state);
}
