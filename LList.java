import java.util.Iterator;
import java.util.LinkedList;

public class LList {
    public static void main(String args[])
    {
        LinkedList<String> LL = new LinkedList<>();
        LL.add("I");
        LL.add("PURNANAND");
        LL.add(1,"AM");
        System.out.println("Initial LL" + LL);
        // LL.remove(1);
        // System.out.println("After the index removal" + LL);
        // LL.remove("Geeks");
        // System.out.println("After the object removal" + LL);
        Iterator i= LL.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }        

    }
    
}
