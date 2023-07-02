public class nishit3 {
    static char maximum(String s){
        int count[]=new int[256]; //ascii size
        for (int i = 0; i <s.length(); i++) 
            count[s.charAt(i)]++;
        
            int max=-1;
            char c=' ';
        for (int i = 0; i <s.length(); i++) {
            if(max<count[s.charAt(i)]){
                max=count[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        return c;
        }
    
        public static void main(String[] args) {
            System.out.println(maximum("nishit"));
        }
    }
