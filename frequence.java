/**
 * frequence
 */
public class frequence {

    public static void main(String[] args) {
        String s="yyashaaa";
        int count=0;
        char ch[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count=0;
            for (int j = 0; j <s.length(); j++) {
            if(j<i&&ch[i]==ch[j]){
                break;
            }    
            if(ch[i]==ch[j]){
                count++;
            }
            if(j==ch.length-1){
                System.out.println(ch[i]+"="+count);
            }
            }
        }
    }
}