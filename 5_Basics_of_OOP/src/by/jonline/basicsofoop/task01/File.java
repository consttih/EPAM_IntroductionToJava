package by.jonline.basicsofoop.task01;

public class File {
	
	private String name;
	private Directory directoryName;
	
	public File() {}

	public File(String name, Directory directoryName) {
		super();
		this.name = name;
		this.directoryName = directoryName;
	}
	
	public File changeName (String newname) {
		setName(newname);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(Directory directoryName) {
		this.directoryName = directoryName;
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}
	
	
	

}
