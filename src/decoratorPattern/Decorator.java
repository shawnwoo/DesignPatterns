package decoratorPattern;

public class Decorator implements Component {
	
	private Component component;

	public Decorator(Component component){
		this.component=component;
	}
	
	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		component.sampleOperation();

	}

}
