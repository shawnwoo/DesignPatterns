package statePattern;

public class Yellow implements LightState {
	public void behave() {
		System.out
				.println("Vehicles in the intersection, proceed with caution ");
	}

	@Override
	public boolean isAllowChangeTo(LightState state) {
		// TODO Auto-generated method stub

		if (state.getName().equalsIgnoreCase("green"))
			return true;
		else
			return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "yellow";
	}
}
