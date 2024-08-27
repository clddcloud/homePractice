package example.e138;
public class E138AccessModifiers {
       private String method0(){
            return ("private");
       }
       String method1(){
            return ("default");
       }
       protected String method2(){
            return ("protected");
       }
       public String method3(){
             return ("public");
       }

       public static void main(String[] args) {
              E138AccessModifiers obj=new E138AccessModifiers();
              System.out.println(obj.method1());
              System.out.println(obj.method2());
              System.out.println(obj.method3());
       }
}
