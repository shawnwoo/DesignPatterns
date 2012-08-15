package observerPattern;

import java.util.Enumeration;
import java.util.Vector;

public class Comment implements Subject{
	
	private Vector observersVector=new java.util.Vector();

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.addElement(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.removeElement(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration enu=observers();
		while(enu.hasMoreElements()){
			((Observer)enu.nextElement()).update();
		}
		
	}

	public Enumeration observers() {
		// TODO Auto-generated method stub
		return ((Vector)observersVector.clone()).elements();
	}

}
