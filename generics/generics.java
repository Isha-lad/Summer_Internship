import java.util.*;  
class generics
{  
    public static void main(String args[])
    {  
        ArrayList<String> list=new ArrayList<String>();  
        list.add("Isha");  
        list.add("shiv"); 
        list.add("Rajvi"); 
        String s=list.get(0);
        System.out.println("element: "+s);  
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
} 