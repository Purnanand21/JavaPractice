import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int ans = sum2();
       System.out.println(ans);
       String message = greet();
       System.out.println(message);
       int res = sum3(10, 20);
       System.out.println(res);
      
        
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = in.nextInt();
        System.out.println("Enter Second number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
        // System.out.println("Sum is:"+ sum);
    }
    static String greet(){
        String greeting = "Hello Are You:";
        return greeting;
    }
    
    static int sum3(int a, int b){
        int result = a + b;
        return result;
       

    }
}
