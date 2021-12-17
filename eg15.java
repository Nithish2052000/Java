class eg15
{
public static void main(String args[]) 
{
rec2 r1=new rec2(10);
for (int i=0;i<10;i++)
{
r1.values[i]=i;
}
r1.print(10);
}
}
class rec2
{
int values[];
rec2(int i)
{
values=new int[i];
}
void print(int i)
{
 if(i==0)
return;
else
print(i-1);
System.out.println("["+i+"]"+values[i-1]);
}
}

