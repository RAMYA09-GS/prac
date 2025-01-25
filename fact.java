class fact
{
	int a;

	fact(int a)
	{
		this.a=a;
		System.out.println(this.a);

	}
	fact(fact fact)
	{
		this.a=fact.a;
		System.out.println(this.a);
	}
int factorial()
{
int facto=1;
for(int i=1;i<=a;i++)
{
facto=facto*i;
}
return facto;
}
public static void main(String args[])
	{
		fact obj=new fact(5);
		fact obj2=new fact(obj);
		System.out.println("Factorial: "+obj.factorial);

	}
}
