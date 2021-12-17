class Break 
{ 
public static void main(String args[]) 
{ 
boolean t = true;
f:
{
s:
{
t1:
{
x:
{
System.out.println("Before the break.");
if(t) break s;
System.out.println("This won't execute");
}
}
System.out.println("This won't execute"); 
}
System.out.println("This is after second block."); }
}
}