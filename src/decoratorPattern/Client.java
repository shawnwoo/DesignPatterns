package decoratorPattern;

public class Client {
	
	public static void main(String[] args){
		ConcreteDecorator cd= new ConcreteDecorator(new ConcreteComponent());
		
		cd.sampleOperation();
	}
	
	
}
