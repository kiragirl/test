/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.structuralpattern.proxy;

/**
 * Title: ProxyImage Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
