package by.jonline.simpleclasses.task01;

public class Test1 {

  private int variable1;
  private int variable2;
  
  public Test1(int variable1, int variable2) {
    super();
    this.variable1 = variable1;
    this.variable2 = variable2;
  };
  
  public int getVariable1() {
    return variable1;
  };
  
  public void setVariable1(int variable1) {
    this.variable1 = variable1;
  };
  
  public int getVariable2() {
    return variable2;
  };
  
  public void setVariable2(int variable2) {
    this.variable2 = variable2;
  };
  
  public int Sum() {
    return this.variable1 + this.variable2;
  };
  
  public int HighestValue() {

    if(this.variable1 > this.variable2) {
      return this.variable1;
    }else {
      return this.variable2;
    }
  };
}
