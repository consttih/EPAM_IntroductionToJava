package by.jonline.simpleclasses.task02;

public class Main {

  public static void main(String[] args) {
    
    Test2 t2 = new Test2(4, 5);
    System.out.println(t2.getVariable1() + " " + t2.getVariable2());
    
    Test2 t22 = new Test2();
    System.out.println(t22.getVariable1() + " " + t22.getVariable2());
    
    t2.setVariable1(20);
    t2.setVariable2(21);
    System.out.println(t2.getVariable1() + " " + t2.getVariable2());
  };

}
