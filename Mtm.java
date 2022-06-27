package com.java.q2;

public class Mtm {

	
public static void main(String[] args) {
		Material st = new Material(" Java,", " Advance Java,", " react,", " react2,");
		Material st1 = new Material(" Advance Java,"," hybris,",  " business,", " Css1");
		Material st2 = new Material( " Advance Java,", " jdbc,"," CoreJava,", " Css2");
		Material st3 = new Material(" Advance Java,", " Html", " Css,"," CoreJava6");
		Trainees t1 = new Trainees("vasa ",3 );
		Trainees t2 = new Trainees("mani ",6 );
		Trainees t3 = new Trainees("deep ",7 );
		Trainees t4 = new Trainees("guptha ",9 );
		System.out.println(t1.getName()+t1.getId()+st.Subject1+st.Subject2+st.Subject3+st.Subject4);
		System.out.println(t2.getName()+t2.getId()+st1.Subject1+st1.Subject2+st1.Subject3+st1.Subject4);
		System.out.println(t3.getName()+t3.getId()+st2.Subject1+st2.Subject2+st2.Subject3+st2.Subject4);
		System.out.println(t4.getName()+t4.getId()+st3.Subject1+st3.Subject2+st3.Subject3+st3.Subject4);

	}

}


