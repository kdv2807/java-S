package threadex;
public class Threadex {
    public synchronized void print(int a)
    {
    for(int i=1;i<=5;i++)
    {
        System.out.println(a*i);
    }
    
    }
}
    class demo extends Thread
    {
        Threadex t;
      public  demo(Threadex t)
        {
            this.t=t;
        }
        public void run()
        {
            t.print(5);
            
//            System.out.println();
        }  
    }
    class demo1 extends Thread
    {
    Threadex t;
    public demo1(Threadex t)
    {
    this.t=t;
    }
    public void run()
    {
        t.print(10);
//        System.out.println(10);
    }
    }
       class thre{ 
    public static void main(String[] args){
     Threadex obj= new Threadex();   
   demo d= new demo(obj);
   demo1 d1= new demo1(obj);
   d.start();
   d1.start();
    
    }
    
        
}
