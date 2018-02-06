/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.structuralpattern.adapter;


/**
 * 	Title: Mp4Player
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Mp4Player implements AdvancedMediaPlayer{
	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param fileName
	 */
	@Override
	public void play(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);  
	}

}
