public class stringreverse {
    public static void main(String[] args) {
        String s="yash desai";
        String rev="";
        for (int i = s.length()-1; i>=0; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        //if (rev.equals(s)){
        //    System.out.println("Palindrom");
        //}
        //else{
          //  System.out.println("Not");
        //}
    }
}
