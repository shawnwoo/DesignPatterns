package observerPattern;

public class MainTest {
	
	private static Comment comment;
	private static Observer listener;
	
	
	public static void main(String[] args){
		comment=new Comment();
		listener=new Listener();
		comment.attach(listener);
		comment.generateNewComment("I heared that...");
		
	}

}
