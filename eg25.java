class eg25
{
public static void main(String args[])
{
try
{int b=0;
 int a=45;
 a/=b;
System.out.println("The value of A : "+a);
}catch(ArithmeticException e) {
System.out.println("Exception :"+e);
}
}
}
