interface mulipltinterface {
    void details();
}
interface multi{
    void name();
}
class A implements mulipltinterface,multi{
    public void details(){
        System.out.println("Hi yash");
    }
    public void name(){
        System.out.println("Kahaan dalal");
    }
    public static void main(String[] args) {
        A m=new A(); 
            m.details();
            m.name();
        
    }
}

