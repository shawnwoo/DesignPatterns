package statePattern;

public class testMain {
	public static  void main (String[] args){
		TraficSystem ts=new TraficSystem();
		
		ts.setState(new Red());
		ts.behave();
		ts.setState(new Green());
		ts.setState(new Yellow());
		ts.behave();
		ts.setState(new Green());
		ts.behave();
		ts.setState(new Red());
		ts.behave();
		
	}

}
