import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.printf("%s ", element);
        } 
        System.out.println();
    }
    // Write your code here

}

public class example {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
// public class example{
//     public static void main(String[] args){
//         int mask = 0x000F;
//         int value = 0x2222;
//         System.out.println(value & mask);
//     }
// }

/* h ***** */
/* h /* ef *//**/
/* h // efc */
// /* fe // // ef */


// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class example {



//     private static final Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int[][] arr = new int[6][6];
//         int count = 0;
//         int max_count = 0; 
//         for (int i = 0; i < 6; i++) {
//             String[] arrRowItems = scanner.nextLine().split(" ");
//             scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//             for (int j = 0; j < 6; j++) {
//                 int arrItem = Integer.parseInt(arrRowItems[j]);
//                 arr[i][j] = arrItem;
//             }
//         }
//         for(int x=0; x<4; x++){
//             for(int y=0; y<4; y++){
//                 count = arr[x][y] + arr[x+1][y] + arr[x+2][y] + arr[x+1][y+1] + arr[x][y+2] + arr[x+1][y+2] + arr[x+2][y+2];
//                 if(max_count < count){
//                 max_count = count;
//         }
//             }
//         }
//         System.out.println(max_count);
//         scanner.close();
//     }
// }