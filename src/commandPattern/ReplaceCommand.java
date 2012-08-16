package commandPattern;

public class ReplaceCommand implements Command {

	private Report receiver;
	private boolean done;
	private String wordToReplace;
	private String newWord;
	
	public ReplaceCommand(Report receiver,String wordToReplace,String newWord){
		this.receiver=receiver;
		this.wordToReplace=wordToReplace;
		this.newWord=newWord;
		done=false;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.replace(wordToReplace, newWord);
		done=true;
	}
	
	public void undo(){
		receiver.replace(newWord, wordToReplace);
		done=true;
	}

}
