/**
 * frequence2
 */
public class frequence2 {

    public static void main(String[] args) {
        String s="saasyyq";
        int count=0;
        for(char ch='a';ch<='z';ch++){
        count=0;
        for (int i = 0; i <s.length(); i++) {
            if(ch==s.charAt(i)){
                count++;
            }
        }
        if(count!=0){
            System.out.println(ch+"="+count);
        }
        }

    }
}