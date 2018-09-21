
package gen_ex;

public class Gen_ex<T> {
    T a;
    

 
    public <T> T showvalue(T a)
    {
        System.out.println("The Value Of A Is: "+a);
         return a;
         
    }
    
    public static void main(String[] args) {
      Gen_ex<Integer> obj=new Gen_ex<>();
      obj.showvalue(5);
    }
    
}
