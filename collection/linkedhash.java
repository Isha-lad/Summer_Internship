import java.util.*;

class linkedhash
{
    public static void main(String args[])
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
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