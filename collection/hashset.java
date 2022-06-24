import java.util.*;

class hashset
{
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Isha");
        set.add("Shiv");
        //hs.insert("Rajvi");
        Iterator<String> ir = set.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
    }
}