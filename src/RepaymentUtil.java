

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Company: pusense <br/>
 * Copyright: Copyright (c)2014 <br/>
 * Description: 还款工具类，等额本息、等额本金、先息后本。
 * 
 * @author: wunan
 * @version: 1.0 Create at: 2014-12-12 
 * 
 */

public class RepaymentUtil {
	/**
	 * 还款账单 anjianchao add
	 * 
	 * @param loanAmount
	 *            还款金额
	 * @param loanPeriod
	 *            还款期限
	 * @param rates
	 *            还款年利率
	 * @param repayment
	 *            还款方式
	 * @return List<Map<String,String>>( 键值 principal：存储本金 键值 interest：存储利息 键值
	 *         benxi：存储本息 键值endDate：还款日期)
	 * 
	 */
	public static List<Map<String, String>> Bill(String loanAmount,
			String loanPeriod, String rates, String repayment,
			String tradingStartTime) {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();// list集合
		Map<String, String> map = null;// map集合
		DecimalFormat df = new DecimalFormat("#.00");// 保留小数点后两位
		/* 数据暂定为 */
		BigDecimal loanmoney = new BigDecimal(loanAmount);// 借款金额
		BigDecimal paramMoney = new BigDecimal(1);// 借款金额基数(10000元数据库存储数据以万元为单位)
		BigDecimal totalmomey = loanmoney.multiply(paramMoney); // 贷款总金额
		BigDecimal rate = new BigDecimal(rates);// 年利率
		BigDecimal paramRate = new BigDecimal(100);// 利率参数(数据库存储为例如：20)
		BigDecimal paramMonth = new BigDecimal(12);// 一年12个月
		BigDecimal taxrate = rate
				.divide(paramRate, 6, BigDecimal.ROUND_HALF_UP); // 当前利率 (年利率)
		BigDecimal tax = taxrate
				.divide(paramMonth, 9, BigDecimal.ROUND_HALF_UP); // 当前利率 (月利率)
		BigDecimal time = new BigDecimal(loanPeriod);// 借款期限（月）
		BigDecimal num = new BigDecimal(1);// 用于计算本息
		BigDecimal root = num.add(tax);// 跟
		/**/
		if ("按月等额本金".equals(repayment)) {
			// 根据借款期限计算每月所还本金
			BigDecimal oneMonthMoney = totalmomey.divide(time, 6,
					BigDecimal.ROUND_HALF_UP);
			for (int j = 1; j <= Integer.parseInt(loanPeriod); j++) {
				// 把变量转换为BigDecimal数据格式
				BigDecimal paramj = new BigDecimal(j);
				// 计算每月所还利息
				BigDecimal taxMoney = new BigDecimal(0);
				if (j == 1) {
					taxMoney = totalmomey.multiply(tax);
				} else {
					taxMoney = (totalmomey.subtract(oneMonthMoney
							.multiply(paramj.subtract(new BigDecimal(1)))))
							.multiply(tax);
				}

				BigDecimal money = oneMonthMoney.add(taxMoney);// 每月所还本息

				map = new HashMap<String, String>();// map集合
				map.put("endDate", timeSubtraction(tradingStartTime,
						String.valueOf(j)).substring(0, 11));// 还款时间
				map.put("principal", df.format(oneMonthMoney));// 每月本金
				map.put("interest", df.format(taxMoney));// 实际每月利息
				map.put("benxi", df.format(money));// 每月还款金额
				list.add(map);// 填充到list集合
				/*System.out.println("每月应还款金额 = "
						+ df.format(money)
						+ "实际每月利息="
						+ df.format(taxMoney)
						+ "每月应还款本金= "
						+ df.format(oneMonthMoney)
						+ "还款日期="
						+ timeSubtraction(tradingStartTime, String.valueOf(j))
								.substring(0, 11));
								*/
			}
		} else if ("按月等额本息".equals(repayment)) {
			for (int i = 1; i <= Integer.parseInt(loanPeriod); i++) {
				// 每月利息额
				BigDecimal monthinterestmoney = totalmomey.multiply(tax)
						.multiply(
								root.pow(Integer.parseInt(loanPeriod))
										.subtract(root.pow(i - 1))).divide(
								(root.pow(Integer.parseInt(loanPeriod))
										.subtract(num)), 6,
								BigDecimal.ROUND_HALF_UP);
				// 每月还款额
				BigDecimal monthmoney = totalmomey.multiply(tax).multiply(
						root.pow(Integer.parseInt(loanPeriod))).divide(
						(root.pow(Integer.parseInt(loanPeriod)).subtract(num)),
						6, BigDecimal.ROUND_HALF_UP);
				// 每月本金
				BigDecimal principalmoney = monthmoney
						.subtract(monthinterestmoney);
				// 实际每月利率
				BigDecimal monthacive = monthinterestmoney.divide(monthmoney,
						6, BigDecimal.ROUND_HALF_UP);

				map = new HashMap<String, String>();// map集合
				map.put("endDate", timeSubtraction(tradingStartTime,
						String.valueOf(i)).substring(0, 11));// 还款时间
				map.put("benxi", df.format(monthmoney));// 每月还款金额
				map.put("principal", df.format(principalmoney));// 每月本金
				map.put("interest", df.format(monthinterestmoney));// 实际每月利息
				map.put("monthacive", df.format(monthacive));// 实际每月利率
				list.add(map);
				/*System.out.println("每月还款金额="
						+ df.format(monthmoney)
						+ "每月本金="
						+ df.format(principalmoney)
						+ "实际每月利息="
						+ df.format(monthinterestmoney)
						+ "还款日期="
						+ timeSubtraction(tradingStartTime, String.valueOf(i))
								.substring(0, 11));
								*/
								
			}

		} else if ("到期一次性还款".equals(repayment)) {
			// 本息
			BigDecimal money = totalmomey.multiply(tax).multiply(time).add(
					totalmomey);
			BigDecimal oneMonthMoney = totalmomey;// 本金
			BigDecimal taxMoney = totalmomey.multiply(tax).multiply(time);// 利息
			map = new HashMap<String, String>();// map集合
			map.put("benxi", df.format(money));// 本息
			map.put("endDate", timeSubtraction(tradingStartTime,
					String.valueOf(loanPeriod)).substring(0, 11));// 还款时间
			map.put("principal", df.format(oneMonthMoney));// 存储本金
			map.put("interest", df.format(taxMoney));// 存储利息
			list.add(map);
			/*System.out.println("本息="
					+ df.format(money)
					+ "本金="
					+ df.format(oneMonthMoney)
					+ "利息="
					+ df.format(taxMoney)
					+ "还款日期="
					+ timeSubtraction(tradingStartTime,
							String.valueOf(loanPeriod)).substring(0, 11));
							*/
		}
		return list;
	}

	private static String timeSubtraction(String tradingStartTime,
			String valueOf) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss",
				Locale.CANADA);
		try {
			Date date = simpleDateFormat.parse(tradingStartTime);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, Integer.parseInt(valueOf));
			simpleDateFormat.format(calendar.getTime());
			return simpleDateFormat.format(calendar.getTime()).toString();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "获取日期出错";
		}
	}

	/**
	 * 测试方法
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		System.out.println(Bill("25", "3", "14", "按月等额本息", "2013-07-01 00:00:00"));

	}

}
