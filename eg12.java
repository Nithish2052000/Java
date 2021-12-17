class eg12
{
public static void main(String args[])
{
cbr c2=new cbr(10,15);
c2.method(c2);
System.out.println("The variables are : "+c2.a+c2.b);
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
void method(cbr c1)
{
c1.a*=3;
c1.b/=3;
}
}
