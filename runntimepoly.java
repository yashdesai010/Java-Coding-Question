public class runntimepoly {
    void display(){
        System.out.println("Hi");
    }
}
    class poly extends runntimepoly{
        void display(){
            System.out.println("Desai");
        }
        public static void main(String[] args) {
            poly p=new poly();
            p.display();
            runntimepoly r=new runntimepoly();
            r.display();
        }
    }

