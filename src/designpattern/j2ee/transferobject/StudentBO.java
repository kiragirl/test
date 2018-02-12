/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: StudentBO Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class StudentBO{

	// 列表是当作一个数据库
	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert", 0);
		StudentVO student2 = new StudentVO("John", 1);
		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// 从数据库中检索学生名单
	public List<StudentVO> getAllStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
}