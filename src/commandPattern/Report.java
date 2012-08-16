package commandPattern;

public class Report {

	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void replace(String oldWord, String newWord) {
		text = text.replaceAll(oldWord, newWord);
	}

}
