import java.util.LinkedHashSet;

public class deuplicateremove {
    public static void main(String[] args) {
        String s="yashyayashsh";
        LinkedHashSet<Character> ls=new LinkedHashSet<>();
        for (int i = 0; i <s.length(); i++) {           
        ls.add(s.charAt(i));
    }
    for(Character j:ls){
        System.out.print(j);
    }
}

}