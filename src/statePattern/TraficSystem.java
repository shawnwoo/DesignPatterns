package statePattern;

public class TraficSystem {
	private LightState state;

	public void behave() {
		state.behave();
	}

	public void setState(LightState state) {
		if (this.state == null)
			this.state = state;

		else if (this.state.isAllowChangeTo(state))
			this.state = state;
		else
			System.out.println("Cannot change to that state!");
	}

}
