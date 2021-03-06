package by.jonline.basicsofoop.task01;

public class TextFile extends File{
	
	private String content = "";

	public TextFile() {
		super();
	}
	
	public TextFile(String name) {
		this.setName(name);
	}

	public TextFile(String name, Directory directoryName) {
		super(name, directoryName);
		super.getDirectoryName().addTextFile(this);
	}
	
	public void showContent() {
		System.out.println(content);
	}
	
	public void complement(String text) {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getContent()).append(text);
		this.content = sb.toString();
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + "]";
	}
	
	
	
	

}
