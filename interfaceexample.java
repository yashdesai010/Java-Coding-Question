interface interfaceexample {
    void name();
    void surname();
}
class detailss implements interfaceexample{
public void name(){
    System.out.println("yash");
}
public void surname(){
    System.out.println("Desai");
}
public static void main(String[] args) {
    detailss d=new detailss();
    d.name();
    d.surname();
}
}
