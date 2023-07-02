import java.util.HashSet;

public class longestsubstring {
    public static int longeststring(String s){
        if(s==null||s.equals("")){ //base condition
            return 0;
        }
        int start=0;
        int end=0;
        int set=0;
        HashSet<Character> hp=new HashSet<>();
        while(end<s.length()){
            if(hp.add(s.charAt(end))){
                end++;
            set=Math.max(set,hp.size());
            }
            else{
                hp.remove(s.charAt(start));
                start++;
            }
        }    
        return set;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println("length:"+longeststring(s));
    }
}
