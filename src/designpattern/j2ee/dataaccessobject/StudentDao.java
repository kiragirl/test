/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.dataaccessobject;

import java.util.List;

/**
 * Title: StudentDao Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public interface StudentDao{

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
