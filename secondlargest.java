import java.util.Arrays;

/**
 * secondlargest
 */
public class secondlargest {

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}