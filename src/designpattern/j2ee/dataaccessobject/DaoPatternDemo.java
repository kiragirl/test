/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.dataaccessobject;

/**
 * Title: DaoPatternDemo Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class DaoPatternDemo{

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// 输出所有的学生
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// 获取学生
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
