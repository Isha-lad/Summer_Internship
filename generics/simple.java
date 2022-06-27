class simple<T> 
{
	T obj;
	simple(T obj) 
    {
         this.obj = obj;
    } 
	public T getObject() 
    { 
        return this.obj; 
    }
}
class main
{
       public static void main(String[] args)
	{
		simple<String> sObj = new simple<String>("Isha");
		System.out.println(sObj.getObject());
	}
}


