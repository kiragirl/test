/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.singletion;

/**
 * Title: SingletonPatternDemo Description: Company:pusense
 * 测试方法
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class SingletonPatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();
		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		// 显示消息
		object.showMessage();
	}

}
