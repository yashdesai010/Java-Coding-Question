public class superexample {
    String name="yash";
}
class ans extends superexample{
    void display(){
        String surname="Desai";
        System.out.println(super.name);
        System.out.println(surname);
    }
    public static void main(String[] args) {
        ans a=new ans();
        a.display();
    }
}
