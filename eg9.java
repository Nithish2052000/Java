class eg9
 {
public static void main(String args[])
 {
stack s1=new stack();
stack s2=new stack();
for(int i=0;i<10;i++)
	{
s1.push(i);
	}
for(int i=10;i<20;i++)
	{
s2.push(i);
	}
for(int i=0;i<10;i++)
	{
System.out.println("My stack 1:"+s1.pop());
	}
for(int i=10;i<20;i++)
	{
System.out.println("My stack 2:"+s2.pop());
	}
 }
 }
class stack
{
int stc[]= new int[10];
int tos;
stack()
   {
tos=-1;
   }
void push(int item)
   {
if(tos==9)
System.out.println("The stack is full");
else 
stc[++tos]=item;
   }
int pop()
   {
if(tos==-1)
{
System.out.println("The stack is empty");
return 0;
}
else
{
return stc[tos--];
}
   }
}
