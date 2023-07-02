public class singlelevel {
    String name="Yash";
    String surname="Desai";
}
class example extends singlelevel
{
    void display(){
        System.out.println(name+""+surname);
    }

public static void main(String[] args) {
    example e=new example();
    e.display(); 
    //System.out.println(e.name);
}
}
