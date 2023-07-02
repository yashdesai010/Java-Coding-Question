import java.util.Arrays;

public class anargum {
    public static void main(String[] args) {
        String s1="part";
        String s2="trap";
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("Anargum");
        }
        else{
            System.out.println("Not");
        }
    }
}
