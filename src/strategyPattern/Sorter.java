package strategyPattern;

public class Sorter {
	private SortStrategy sortStrategy;
	
	public void sort(){
		sortStrategy.sort();
	}

}
