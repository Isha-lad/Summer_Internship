class test<T, U>
{
	T obj1; 
	U obj2; 
	test(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class Main
{
	public static void main (String[] args)
	{
		test <String, Integer> obj =
			new test<String, Integer>("Isha", 31);

		obj.print();
	}
}
