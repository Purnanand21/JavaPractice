import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        double p = sc.nextDouble();
        System.out.println("Enter  Rate:");
        double r = sc.nextDouble();
        System.out.println("Enter time:");
        double t = sc.nextDouble();
        System.out.println(CompoundInterest( p, r, t));

    }
    static double CompoundInterest(double p,double r,double t){
        return p * Math.pow((1+r/100),t)-p;
    }
    
}
