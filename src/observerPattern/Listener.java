package observerPattern;

public class Listener implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("I am notified!");
	}
	
	public void printNews(String str){
		System.out.println(str);
		
	}

}
