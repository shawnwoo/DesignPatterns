package FlyweightPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FlyweightFactory {
	
	private HashMap<Character, Flyweight> files=new HashMap<Character, Flyweight>();
	private Flyweight lnkFlyweight;
	
	/**
	 * Constructor
	 */
	public FlyweightFactory(){};

	/**
	 * Constructor
	 * @param intrinsic state
	 */
	
	public Flyweight factory(Character state){
		if (files.containsKey(state))
		{
			return (Flyweight)files.get(state);
		}
		else {
			Flyweight fly=new ConcreteFlyweight(state);
			files.put(state, fly);
			return fly;
		}
	}
	
	public void checkFlyweight(){
		Flyweight fly;
		int i=0;
		System.out.println("\n=====checkFlyweight()=====");
		for(Iterator it=files.entrySet().iterator();it.hasNext();){
			Map.Entry e=(Map.Entry)it.next();
			System.out.println("Item "+ (++i)+":"+e.getKey());
		};
		System.out.println("========checkFlyweight()=========");
	}
}
