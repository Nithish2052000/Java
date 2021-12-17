class Cbr
{
public static void main(String args[])
{
cbr c=new cbr(10,20);
c.meth(c);
System.out.println("The value is:"+c.a+" "+c.b);
}
}
class cbr
{
int a,b;
cbr(int i,int j)
{
a=i;
b=j;
}
void meth(cbr c1)
{
c1.a*=2;
c1.b/=2;
}
}
