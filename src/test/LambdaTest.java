/**
 * @author:liyiming
 * @date:2017年9月29日
 * Description:
 **/
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Title: LambdaTest Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年9月29日
 **/
public class LambdaTest{

	public static void main(String[] args) {
		test1();
	}

	public static void test1() {

/*		List<Shape> shapes = new ArrayList<Shape>();
		for(int i=0;i<10000;i++){
			shapes.add(new Shape(Color.BLUE, new Box("11")));
		}
		for(int i=0;i<10000;i++){
			shapes.add(new Shape(Color.GREEN, new Box("11")));
		}
		for(int i=0;i<10000;i++){
			shapes.add(new Shape(Color.RED, new Box("11")));
		}
		for(int i=0;i<10000;i++){
			shapes.add(new Shape(Color.BLACK, new Box("11")));
		}
		for(int i=0;i<10000;i++){
			shapes.add(new Shape(Color.WHITE, new Box("11")));
		}
		shapes.add(new Shape(Color.WHITE, new Box("11")));
		shapes.add(new Shape(Color.GREEN, new Box("11")));
		shapes.add(new Shape(Color.BLACK, new Box("11")));
		shapes.add(new Shape(Color.BLUE, new Box("11")));
		shapes.add(new Shape(Color.RED, new Box("11")));*/
		/*
		 * for (Shape shape : shapes) { shape.setColor(Color.RED); }
		 */

		// shapes.forEach(s -> s.setColor(Color.RED));

		/*
		 * shapes.stream().filter(s -> s.getColor() == Color.BLUE).forEach( s ->
		 * s.setColor(Color.RED));
		 */

		/*
		 * List<Shape> blue = shapes.stream().filter( s -> s.getColor() ==
		 * Color.BLUE).collect(Collectors.toList());
		 */
		/*
		 * Set<Box> hasBlueShape = shapes.stream().filter( s -> s.getColor() ==
		 * Color.BLUE).map(s -> s.getContainingBox()).collect(
		 * Collectors.toSet());
		 * 
		 * for (Box box : hasBlueShape) { System.out.println(box.ss); }
		 * 
		 * int sum = shapes.stream().filter(s -> s.getColor() ==
		 * Color.BLUE).mapToInt( s -> s.getWeight()).sum();
		 */
		System.out.println(System.currentTimeMillis());
		/*int sum =0;
		for(Shape shape:shapes){
			if (shape.getColor() == Color.BLUE) {
				sum=sum+shape.getWeight();
				System.out.println();
			}
		}*/
		//int sum = shapes.stream().filter(s -> s.getColor() == Color.BLUE).mapToInt( s -> s.getWeight()).sum();
	/*	int sum = shapes.parallelStream().filter(s -> s.getColor() == Color.BLUE).mapToInt(
				s ->{
					try {
						Thread.sleep(1);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return s.getWeight();
					} ).sum();
		shapes.get(9999).setWeight(10);
		System.out.println(sum);
		System.out.println(System.currentTimeMillis());*/
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("a","b"));
		people.add(new Person("c","a"));
		people.add(new Person("c","b"));
		people.add(new Person("a","a"));
		people.add(new Person("b","b"));
		people.add(new Person("b","a"));
		people.add(new Person("a","c"));
		Comparator<Person> c = Comparator.comparing(p -> p.getLastName());
		Comparator<Person> c1 = c.thenComparing(p -> p.getFirstName());
		people.sort(c1);
		people.stream().forEach(p->{
			System.out.println(p.getLastName()+":"+p.getFirstName());
		});
	}

}
class Person{
	String lastName;
	String firstName;
	Person(String lastName,String firstName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
class Shape{
	Random random = new Random();
	Color color;
	Box box;
	int weight=random.nextInt(10);

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Shape(Color color, Box box) {
		this.box = box;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Box getContainingBox() {
		return this.box;
	}
}

class Box{

	String ss;

	public Box(String color) {
		this.ss = color;
	}
}

enum Color {
	WHITE, GREEN, BLACK, BLUE, RED;
}
