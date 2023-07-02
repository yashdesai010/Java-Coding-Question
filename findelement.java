public class findelement {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int find=1;
        boolean flag=false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==find){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Present");
        }
        else{
            System.out.println("Not");
        }
    }
}
