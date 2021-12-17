class eg17
{
static int a=3;
static int b;
static void meth(int x)
{
System.out.println("The value of X"+x);
System.out.println("The value of A"+a);
System.out.println("The value of B"+b);
}
static 
{
System.out.println("The static block has started : ");
b=a*4;
}
public static void main(String args[])
{
meth(42);
}
}
