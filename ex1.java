class ex1{
 public static void main(String[] args) {
boolean t;
t=true;
first: {
second:{
third: {
       if (t)
       {
       	break second;
       }             
}
System.out.println("This statement will not be executed");
}
System.out.println("This statement will be executed");
}

}
	
}