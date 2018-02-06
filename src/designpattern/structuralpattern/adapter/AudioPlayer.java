/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.adapter;

/**
 * Title: AudioPlayer Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param audioType
	 * @param fileName
	 */
	@Override
	public void play(String audioType, String fileName) {
		// 播放 mp3 音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// mediaAdapter 提供了播放其他文件格式的支持
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
