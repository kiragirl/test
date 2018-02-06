/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.visitor;

/**
 * Title: Computer Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class Computer{

	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
	}
}
