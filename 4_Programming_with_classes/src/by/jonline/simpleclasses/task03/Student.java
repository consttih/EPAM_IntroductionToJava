package by.jonline.simpleclasses.task03;

public class Student {
  
  private String surname;
  private String initials;
  private int group;
  public int[] progress; 
  
  public Student (String surname, String initials, int group, int[] progress) {
    super();
    this.surname = surname;
    this.initials = initials;
    this.group = group;
    this.progress = progress;
  };
  
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public void OutPut() {
    System.out.println(this.surname);
    System.out.println(this.initials);
    System.out.println(this.group);
    
    for(int i = 0; i < 5; i++) {
      System.out.print(this.progress[i] + " ");
    };
  };
  
}
