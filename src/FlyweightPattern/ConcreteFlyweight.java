package FlyweightPattern;

public class ConcreteFlyweight extends Flyweight {
	
	private Character intrinsicState=null;
	
	/**
	 * Constructor: Pass the Intrinsic state to it
	 */
	
	public ConcreteFlyweight(Character state){
		this.intrinsicState=state;
	}
	
	/**
	 * Pass the external state to change the behavior
	 * but does not have any effect on Intrinsic state
	 */

	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("\nIntrinsic State= "+intrinsicState+", Extrinsic State= "+state);
		

	}

}
