/**
 * encapsulate
 */
public class encapsulate {

    private String name;
    private String surname;
//getters and setters
public String getname(){
    return name;
}    
public String getsurname(){
    return surname;
}
public void setname(String n){
    name=n;
}
public void setsurname(String s){
    surname=s;
}
public static void main(String[] args) {
    encapsulate e=new encapsulate();
    e.setname("Yash");
    e.setsurname("Desai");
    System.out.println(e.getname());
    System.out.println(e.getsurname());
}
}