package test;

public class TestObjectChange {

	public static void main(String[] args) {
		TestObjectChange student = new TestObjectChange();
		student.setName("name123");
		student.setStudent(student);
		System.out.println(student.getAge());
	}
	public void setStudent(TestObjectChange student){
		student.setAge(0);
	}
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
