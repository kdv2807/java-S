package tp;

import java.util.Scanner;

public class Tp {
enum levels{
 basic,moderate,expert   
};
    public static void main(String[] args) {
        System.out.println("Game Contains Three Levels");
        for(levels r:levels.values())
        {
            System.out.println(r);
        }
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Level You Want Play: ");
        String s=sc.next();
        levels l= levels.valueOf(s); 
        switch(l)           
        {
            case basic: 
                System.out.println("Basic Contains 150 levels");
                break;
            case moderate:
                System.out.println("Moderate Contains 250 levels");
                break;
            case expert:
                System.out.println("Expert Contains 300 levels");
                break;
           default: 
               System.out.println(" Exit");
        }
    
    
    
    
    
    
    
    
    }
    
}
