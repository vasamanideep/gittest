package com.cellphone;



public interface Test
{
public int square(int a);
}
// Implements
class arithmetic implements Test
{
int s = 0;
public int square(int b)
{
System.out.println(�Inside arithmetic class � implemented method square�);
System.out.println(�Square of � + � is �+s);
return s;
}
void armeth()
{

System.out.println(�Inside method of class Arithmetic�);
}
}
public class ToTestInt {
	public static void main(String a[])
	{
	System.out.println(�calling from ToTestInt class main
	method�);
	Test t = new arithmetic();
	System.out.println(n);
	System.out.println(�created object of test interface � reference
	Arithmetic class �);
	System.out.println(�Hence Arithmetic class method square
	called�);
	System.out.println(�This object cannot call armeth method of
	Arithmetic class�);
	System.out.println(s);
	t.square(10);
	System.out.println(m);
	}

}
