import java.util.Scanner;
class a2{
  public static void main(String args[]){
    int arr[][]=new int[3][3];
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the numbers of the array :");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        arr[i][j]=in.nextInt();
      }
      }
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
      System.out.print(arr[i][j]);
      System.out.print(" ");
      }
      System.out.println();
}
}
}
