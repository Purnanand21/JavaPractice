import java.util.Scanner;
public class area_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        System.out.println("enter the base: ");
        float base = in.nextFloat();
        System.out.println("enter the height: ");
        float height = in.nextFloat();
        System.out.println("the area of parallelogram is: " + 2*(base+height));
       
    }
}   