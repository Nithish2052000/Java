package p2;
public class linkedList extends Node{
Node head=new Node();
Node temp=new Node();
void insert(int x){
//System.out.println(x);
Node n=new Node();
n.data=x;
n.link=null;
if(head==null){
head=n;
}
else{
temp=head;
while(temp.link!=null){
temp=temp.link;
}
temp.link=n;
}
}
void show(){
temp=head;
while(temp.link!=null){
temp=temp.link;
System.out.println(temp.data);
}
//System.out.println(temp.data);
//System.out.println("hi");
}
}
