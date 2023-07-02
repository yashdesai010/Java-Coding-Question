import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class reverselinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(new Integer(1));
        li.add(new Integer(2));
        li.add(new Integer(3));
        Collections.reverse(li);
        System.out.println(li);
    }
}
