package set;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ListIterator;
import java.util.Map;

public class Set {
    public static void main(String[] args) {
        HashMap<Integer,String> ts=new HashMap<>();
        
        ts.put(null,"karan");
        ts.put(241,"nitesh");
        ts.put(299,"ayush");
        ts.put(300,"anuj");
        ts.put(301,"rajeev");
        ts.put(302,"sanat");
        System.out.println(ts);
        for(Map.Entry<Integer,String>m:ts.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
//      Iterator i=ts.iterator();
//      while(i.hasNext())
//      {
//          System.out.println(i.next());
//      }
//    
        
//      for(String s:ts.values())
//         {
//           
//             System.out.println(s);
//         }
//        
    
   
//        Vector<Integer> vt=new Vector<Integer>();
//        
//        Integer vt1=new Integer(226);
//        Integer vt2=new Integer(237);
//        Integer vt3=new Integer(248);
////        Integer vt4=new Integer(258);
////        Integegjr vt5=new Integer(268);
//        vt.add(vt1);
//        vt.add(vt2);
//        vt.addElement(vt3);
//       Enumeration e=vt.elements();  
//         while(e.hasMoreElements())
//         {
//           
//             System.out.println("This is Of Vector"+e.nextElement());
//         }
//        
    }   
}
