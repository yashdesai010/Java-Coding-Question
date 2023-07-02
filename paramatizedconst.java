public class paramatizedconst {
    String name;
    String surname;
paramatizedconst(String n,String s){
    name=n;
    surname=s;
}
void display(){
    System.out.println(name+""+surname);
}
public static void main(String[] args) {
    paramatizedconst p=new paramatizedconst("yash", "Desai");
    p.display();
}
}
