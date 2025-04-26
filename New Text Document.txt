package com.aroha;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

class Student {
	private int roll;
	private String name;
	private int std;
	private char section;
	private float marks;
	private String mobile;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Student(int roll, String name, int std, char section, float marks, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.std = std;
		this.section = section;
		this.marks = marks;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", section=" + section + ", marks=" + marks
				+ ", mobile=" + mobile + "]";
	}
	@Override
	public int hashCode() {
		int myHash = 0;
		myHash = Objects.hash(marks, std);
		System.out.println("myHash is " + myHash);
		return myHash;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Hello friend I am here in the equals() ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks) && std == other.std;
	}
}
public class DemoEquals 
{
public static void main(String str[])
{
	Student s1 = new Student(25252,"Priya",8,'A',74.21F,"988xx73xx8");
	System.out.println(s1+" "+s1.hashCode());
	Student s2 = new Student(73773,"Vanitha",8,'A',74.21F,"988xx79xx0");	
	System.out.println(s2+" "+s2.hashCode());
	Student s3 = new Student(73553,"Savitha",8,'A',74.21F,"988xx89xx1");	
	System.out.println(s3+" "+s3.hashCode());
	if (s1.equals(s2) && s1.equals(s3))
		System.out.println(s1.getName() + " is same as " + s2.getName()+ "is also same as "+s3.getName());
	
	else
		System.out.println(s1.getName() + " is NOT same as " + s2.getName());
	HashSet<Student> hs = new HashSet<Student>();
	hs.add(s3);
	hs.add(s2);
	hs.add(s1);
	System.out.println("WATCH " + hs);
	LinkedList<Student> lst = new LinkedList<Student>();
	lst.add(s1); lst.add(s2);lst.add(s3);
	Iterator<Student> itr = lst.iterator();
	while (itr.hasNext())
		System.out.println(itr.next());
	
} 
}