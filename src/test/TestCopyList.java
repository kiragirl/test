package test;

import java.util.ArrayList;
import java.util.List;

public class TestCopyList {
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setAge(10);
		boolean a = s instanceof Student;
		List<Student> list = new ArrayList<Student>();
		list.add(0, s);
		list.get(0).setAge(12);
		System.out.println(list.get(0).getAge());
		List<Student> list2 = new ArrayList<Student>();
		list2.addAll(list);
		System.out.println(list2.get(0).getAge());
		System.out.println(s.getAge());
		s.setAge(13);
		System.out.println(list.get(0).getAge());
		System.out.println(list2.get(0).getAge());
	}
}
class K{
	
}
class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}