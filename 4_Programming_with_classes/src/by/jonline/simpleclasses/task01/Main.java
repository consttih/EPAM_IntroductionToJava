package by.jonline.simpleclasses.task01;

public class Main {

  public static void main(String[] args) {
    
    Test1 t1 = new Test1(5, 10);
    
    System.out.println("value1 = " + t1.getVariable1()); // вывод значений на экран
    System.out.println("value2 = " + t1.getVariable2());
    
    System.out.println();
    System.out.println("changing of values: ");
    
    t1.setVariable1(6); // изменение значения 
    t1.setVariable2(3);
    
    System.out.println("value1 = " + t1.getVariable1()); 
    System.out.println("value2 = " + t1.getVariable2());
    
    System.out.println();
    System.out.println("sum of values " + t1.getVariable1() + " and " + t1.getVariable2() + " is " + t1.Sum()); // сумма 
    
    System.out.println();
    System.out.println("the highest value is " + t1.HighestValue()); // наибольшее значение 
  
  };

}
