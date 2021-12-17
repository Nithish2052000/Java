Class stacktest
{
public static void main(String args[])
{
stack s1=new stack();
stack s2=new stack();
for(int i=0 ; i<10 ; i++)
{
s1.push(i);
}
for(int i=10 ; i<20; i++)
{
s2.push(i);
}
for( i=0 ; i<20 ; i++)
{
System.out.println("Stack 1 is:"+s1.pop())
}
}
}
class stack
{
int stk[]=new int[20];
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
stk[++tos]=item;
}
int pop()
{
if(tos==-1)
System.out.println("Stack underflow");
return 0;
else
return stk[tos--];
}
}
