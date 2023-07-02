import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        int a[]={1,2,3,2,3,2,3};
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
        System.out.println(ts);
    }
}
