package FlyweightPattern;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly=factory.factory(new Character('a'));
		
		fly.operation("first call");
		
		fly=factory.factory(new Character('b'));
		
		fly.operation("second call");
		
		fly=factory.factory(new Character('a'));
		
		fly.operation("third call");
		
		factory.checkFlyweight();
				
		
	}
}
