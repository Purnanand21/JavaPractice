import java.util.Scanner;

// import java.util.*;
// public class Q27 {
//     public static void main(String[] args){
//         // Calculate Average Of N Numbers
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number of elements :");
//         int n = in.nextInt();
//         int sum = 0;
//         System.out.println("Enter the "+n+" elements respectively :");
//         for(int i = 0; i < n; i++){
//             int num = in.nextInt();
//             sum += num;
//         }
//         double average = (double)sum / n;
//         System.out.println(average);
//         in.close();
//     }
// }


// public class Q27{
//     public static void main(String[] args) {
//         int n=5,result=0;
//         int a[]=new int[5];
//         a[0]=10;
//         a[1]=20;
//         a[2]=30;
//         a[3]=40;
//         a[4]=50;
//         for(int i=0;i<n;i++){
//             result=result+a[i];
//         }
//         System.out.println("Average is: "+result/n);
//     }
// }

public class Q27{
    public static void main(String[] args) {
        int n;double res=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers to cal avg");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter " +  n+ " numbers");
        for(int i=0; i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        res= res+a[i];
        System.out.println("average " +  res/n);

    }
}
