public class duplicatelement {
    public static void main(String[] args) {
        String s="abcdefabc";
        char a[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j =i+1; j < s.length(); j++) {
                if(a[i]==a[j]){
                    System.out.print(a[i]);
                }
            }
        }
    }
}
