class A{
  public interface NestedIf{
    public void show();
  }
}
class B implements A.NestedIf{
  public void show(){
    System.out.println("Hello");
  }
}
class a4{
  public static void main(String args[]){
   A.NestedIf X = new B();
   X.show();
  }
}
