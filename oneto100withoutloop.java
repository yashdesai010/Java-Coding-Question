public class oneto100withoutloop {
    public static void main(String[] args) {
    add(1);
    }
   public static void add(int num){
        if(num<=100){
        System.out.println(num);
        num++;
        add(num);
    }
}
}
