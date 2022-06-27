package com.cellphone;

public class Class2 {
	import java.util.*;
	public class Class2 {
	public double area(double r)
	{
	return r*r;
	}
	public double area(double b,double h)
	{
	return b*h;
	}
	public double perimeter(double r)
	{
	return r;
	}
	public double perimeter(double a,double b,double c)
	{
	return a+b+c;
	}



	}
	class Circle extends Class2
	{
	double n,m;
	public double area(double r)
	{
	n=super.area(r);
	n=3.14*n;
	return n;
	}
	public double perimeter(double r)
	{
	m=super.perimeter(r);
	m=2*3.14*m;
	return m;
	}
	}
	class Triangle extends Class2
	{
	double n,m;
	public double area(double r,double h)
	{
	n=super.area(r,h);
	n=0.5*n;
	return n;
	}
	public double perimeter(double r,double b,double c)
	{
	m=super.perimeter(r,b,c);

	return m;
	}
	}
	class Square extends Class2
	{
	double n,m;
	public double area(double r)
	{
	n=super.area(r);
	return n;
	}
	public double perimeter(double r)
	{
	m=super.perimeter(r);
	m=m*4;
	return m;
	}
	}
	public class Shape1 {



	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("please select any shape: circle or triangle or square ");
	String s=sc.next();
	if(s.equals("circle"))
	{
	double m,o;
	Class2 obj=new Circle();
	System.out.println("please enter radius:");
	double n=sc.nextDouble();
	m= obj.area( n);
	System.out.println("area is : "+m);
	o=obj.perimeter(n);
	System.out.println("perimeter is: "+o);

	}
	else if(s.equals("triangle"))
	{
	double m,o;
	Class2 obj=new Triangle();
	System.out.println("please enter base:");
	double n=sc.nextDouble();
	System.out.println("please enter height:");
	double e=sc.nextDouble();
	System.out.println("please enter width:");
	double b=sc.nextDouble();
	m= obj.area( n,e);
	System.out.println("area is : "+m);
	o=obj.perimeter(n,e,b);
	System.out.println("perimeter is: "+o);

	}
	else if(s.equals("square"))
	{
	double m,o;
	Class2 obj=new Triangle();
	System.out.println("please enter side:");
	double n=sc.nextDouble();
	m= obj.area( n);
	System.out.println("area is : "+m);
	o=obj.perimeter(n);
	System.out.println("perimeter is: "+o);

	}
	else
	{
	System.out.println("please choose from circle or triangle or square");
	}
	}



	}

}
