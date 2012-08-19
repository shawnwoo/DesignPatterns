package factoryMethodPattern;

public class Client {
	
	public static void main(String[] args){
		Creator factory1=new ConcreteCreator1();
		Creator factory2=new ConcreteCreator2();
		Product product1=factory1.factory();
		Product product2=factory2.factory();
	}

}
