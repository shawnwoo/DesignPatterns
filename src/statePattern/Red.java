package statePattern;

public class Red implements LightState {

	@Override
	public void behave() {
		// TODO Auto-generated method stub
		System.out.println("Red is ON, Yellow and Green is off");
		System.out.println("No traffic allowed! ");
	}

	public boolean isAllowChangeTo(LightState state) {
		if (state.getName().equalsIgnoreCase("yellow"))
			return true;
		else
			return false;
	}

	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "red";
	}

}
