class eg16
{
public static void main(String args[])
{
acp ac1=new acp();
ac1.a=100;
ac1.b=20;
ac1.c=100;
System.out.println("The value of c: "+ac1.getc());
}
}
class acp
{
int a;
public int b;
private int c;/*Make it as public to avoid error*/
void set(int i)
{
c=i;
}
int getc()
{
return c;
}
}
