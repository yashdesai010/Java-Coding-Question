abstract class abstractionexample {
    abstract void name();
}
class details extends abstractionexample{
  void name(){
    System.out.println("Yash Desai");
  }
 public static void main(String[] args) {
abstractionexample ab=new details(); 
    ab.name();
}
}
  
