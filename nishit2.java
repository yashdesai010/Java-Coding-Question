public class nishit2 {
    public static void main(String[] args) {
        String s="niishit soni yash desai";
        int count=1;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
