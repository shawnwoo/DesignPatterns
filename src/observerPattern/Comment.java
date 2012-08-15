package observerPattern;

import java.util.Enumeration;
import java.util.Vector;

public class Comment implements Subject{
	
	private Vector observersVector=new java.util.Vector();
	private String words;

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
			Observer temp=(Observer)enu.nextElement();
			temp.update();
			temp.printNews(this.toString()+" said that "+ this.words);
		}
		
	}

	public Enumeration observers() {
		// TODO Auto-generated method stub
		return ((Vector)observersVector.clone()).elements();
	}
	
	public void generateNewComment(String words){
		this.words=words;
		
		this.notifyObservers();
	}

}
