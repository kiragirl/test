/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.structuralpattern.adapter;


/**
 * 	Title: VlcPlayer
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class VlcPlayer implements AdvancedMediaPlayer{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param fileName
	 */
	@Override
	public void play(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName); 
	}

}
