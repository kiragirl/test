/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.adapter;

/**
 * Title: MediaAdapter Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class MediaAdapter{

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param audioType
	 * @param fileName
	 */
	public void play(String fileName) {
		advancedMusicPlayer.play(fileName);
	}

}
