import java.util.Scanner;
class prime{
  double n;
  boolean primer(int q){
  for(double i=(q-1);i>1;i--){
  System.out.print(i+" ");
  n=q%i;
  System.out.println(n);
  if(n==0.000000000)
  return false;
  }
  return true;
}
}
class a10{
public static void main(String args[]){
  prime p=new prime();
  System.out.println("Enter the number");
  Scanner in =new Scanner(System.in);
  int m=in.nextInt();
  boolean isPrime=p.primer(m);
  System.out.println("Is the no. prime"+isPrime);
  }
}
