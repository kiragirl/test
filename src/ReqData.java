/**
* @author:liyiming
* @date:2018年3月1日
* Description:
**/



/**
 * 	Title: ReqData
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年3月1日
 **/
public interface ReqData{
	
	default String getSignature(){
		return FuiouOperationUtil.getSignature(this);
	};
}
