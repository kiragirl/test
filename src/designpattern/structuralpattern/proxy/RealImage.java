/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.structuralpattern.proxy;

/**
 * Title: RealImage Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class RealImage implements Image{

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 */
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
