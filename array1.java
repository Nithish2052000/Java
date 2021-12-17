public class aray1
{
public static void main(String[] arguments)
{
int c[]={ 0,0,0,0,0,0,0,0,0,0};
int b[]={ 1,2,3,4,5,6,7,8,9,10};
for (int i=1;i<=10;i++)
{
c[i]=b[i]+2;
}
for (int i=1;i<=10;i++)
{
System.out.println("The array c is "+ c[i]);
}
}
}