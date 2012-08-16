package commandPattern;

public class Execercise {
	
	public static void main(String[] args){
		Report report;
		Command[] textEdit=new Command[2];
		report = new Report();
		report.setText("On a fine spring morning, in a far way region...");
		System.out.println("Original Report: "+report.getText());
		textEdit[0]=new ReplaceCommand(report,"spring","summer");
		textEdit[1]=new ReplaceCommand(report,"region","galaxy");
		
		for (int i=0;i<textEdit.length;i++){
			textEdit[i].execute();
		}
		System.out.println("Report After Replacement: "+report.getText());
		
		textEdit[0].undo();
		textEdit[1].undo();
		
		System.out.println("Report After Undo: "+report.getText());
	}

}
