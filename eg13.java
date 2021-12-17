class eg13
{
public static void main(String args[])
{
ret r2=new ret(2);
ret r3;
r3=r2.method(r2);
System.out.println("The value is : "+r3.a);

for(int i=0;i<10;i++)
{
r3=r3.method(r3);
}
System.out.println("The value is : "+r3.a);
}
}
class ret
{
int a;
ret(int i)
{
a=i;
}
ret method(ret r1)
{
r1=new ret(a+10);
return r1;
}
}
