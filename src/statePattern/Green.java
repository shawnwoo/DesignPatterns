package statePattern;

public class Green implements LightState {

	@Override
	public void behave() {
		// TODO Auto-generated method stub
		System.out.println("Go! ");

	}

	@Override
	public boolean isAllowChangeTo(LightState state) {
		// TODO Auto-generated method stub
		if (state.getName().equalsIgnoreCase("red"))
			return true;
		else
			return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "green";
	}

}
