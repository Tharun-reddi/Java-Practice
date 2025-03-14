package Final;

public class Method {
     public final void sound(){
        System.out.println(" Animal Makes Sound");
     }
     public class  Animal extends Method{
        
       // This will result in a compilation error because sound() is final in the parent class
        // public void sound(){
        //     System.out.println("cat makes sound");
        }
            public static void main(String[] args) {
                Method obj = new Method();
                obj.sound();
            }
     }
