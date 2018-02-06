/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.template;

/**
 * Title: Game Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public abstract class Game{

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// 模板
	public final void play() {

		// 初始化游戏
		initialize();

		// 开始游戏
		startPlay();

		// 结束游戏
		endPlay();
	}
}
