import java.util.Iterator;
import java.util.LinkedList;

class linkedlist 
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Isha");
        ll.add("Shiv");
        Iterator<String> ir = ll.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }

    }
}