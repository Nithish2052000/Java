import java.util.Scanner;
class sorting
{
public static void main(String args[])
{
int s;
int a[]=new int[100];
Scanner sorting=new Scanner(System.in);
System.out.println("Enter the number of numbers to be sorted : ");
int n=sorting.nextInt();
for(int i=0;i<n;i++)
{
System.out.print("Enter the number ["+i+"] : ");
try
{
a[i]=sorting.nextInt(); 
}catch(Exception e)
{
System.out.println("please enter only integers");
}
System.out.println("");
}
for(int j=0;j<n;j++)
 {
for(int i=0;i<n;i++)
 {
if(a[i]>a[i+1])
 {
s=a[i+1];
a[i+1]=a[i];
a[i]=s;
 }
 }
 }
System.out.println("The sorted array is :");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}