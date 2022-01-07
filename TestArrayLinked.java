import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("James");
        al.add("Pushpa");
        al.add("Rana");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Allu Arjun");
        al2.add("Chaitnya");
        al2.add("Shashi");
        System.out.println("LinkedList"+ al);
        System.out.println("ArrayList" + al2);
    }
    
}
