public class sentencereverse {
    public static void main(String[] args) {
        String s[]="yash desai".split(" ");
        String rev="";
        for(int i=s.length-1;i>=0;i--){
            rev+=s[i];
        }
        System.out.println(rev);
    }
}