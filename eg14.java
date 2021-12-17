class eg14
{
public static void main(String args[])
{
fact f1=new fact();
System.out.println("The factorial of 3 : "+f1.factorial(3));
System.out.println("The factorial of 4 : "+f1.factorial(4));
System.out.println("The factorial of 5 : "+f1.factorial(5)); 
}
}
class fact
{
int factorial(int n)
{
if (n==0)
return 1;
else
return factorial(n-1)*n;
}
}
