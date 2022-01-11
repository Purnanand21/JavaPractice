// import java.util.Scanner;
// public class Q25 {
//     // factorial program using loop
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n =in.nextInt();
//         int fact = 1;
//         for(int i =1; i<=n; i++)
//         {
//             fact= fact*i;
//         }
//         System.out.println("Factorial of: "+ n + "is "+ fact);
//         in.close();
//     }

    
// }
public class Q25{
    // factorial using recursion
    static int factorial(int n){
        if(n==0)
        return 1;
        else
        return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        int i,fact=1;
        int number=4;
        fact=factorial(number);
        System.out.println(fact);

       

    }
}
