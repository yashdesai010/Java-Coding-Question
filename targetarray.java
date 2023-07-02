public class targetarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int target=9;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==target){
                    System.out.println(a[i]+"+"+a[j]+"="+target);
                    System.out.println("index:"+i+","+j);
                }
            }
        }
    }
}
