package statePattern;

public interface LightState {
	void behave();
	boolean isAllowChangeTo(LightState state);
	
	String getName();

}
