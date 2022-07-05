package by.jonline.basicsofoop.task01;

import java.util.ArrayList;

public class Directory {
	
	private String name;
	private ArrayList<TextFile> files;
	
	public Directory() {};
	
	public Directory(String name) {
		super();
		this.name = name;
		files = new ArrayList<>();
	}

	public void addTextFile(TextFile file) {
		files.add(file);
	}
	
	public void removeFile(String filename) {
		
		for (int i = 0; i < files.size(); i++) {
			
			if (files.get(i).getName().compareToIgnoreCase(filename) == 0) {
				files.remove(i);
			}
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<TextFile> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<TextFile> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", files=" + files + "]";
	}
	
	

}
