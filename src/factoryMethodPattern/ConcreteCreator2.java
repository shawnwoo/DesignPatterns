package factoryMethodPattern;

public class ConcreteCreator2 implements Creator {

	@Override
	public Product factory() {
		// TODO Auto-generated method stub
		return new ConreteProduct2();
	}

}
