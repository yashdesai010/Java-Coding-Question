import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        System.out.println(al);
        for (Integer i : al) {
        System.out.print(i);
        }
    }
}
