public class digitsum {
    public static void main(String[] args) {
        int num=169;
        int sum=0,ans;
        while(num>0){
    ans=num%10;
    sum=sum+ans;
    num/=10;
        }
        System.out.println(sum);
    }
}
