/**
 * @author:liyiming
 * @date:2017年11月3日
 * Description:
 **/
package testJDK8.locktest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Title: Single Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年11月3日
 **/
public class Single{

	private static Map<String, InvestMoneyLoan> loanInvestMoneyMap = new HashMap<String, InvestMoneyLoan>();
	private static Lock lock = new ReentrantLock();
	static {
		loanInvestMoneyMap.put("lo10000", new InvestMoneyLoan());
	}

	public boolean addLoanInvestMoney(String id, double money) {
		InvestMoneyLoan iml = loanInvestMoneyMap.get(id);
		boolean money2 = false;
		money2 = iml.addMoney(money);
		/*
		 * try { lock.lock();
		 * 
		 * } catch (Exception e) {
		 * 
		 * } finally { lock.unlock(); }
		 */
		return money2;
	}

	public boolean minusLoanInvestMoney(String id, double money) {
		InvestMoneyLoan iml = loanInvestMoneyMap.get(id);
		return iml.minusMoney(money);
	}

	public double getLoanInvestMoney(String id) {
		InvestMoneyLoan iml = loanInvestMoneyMap.get(id);
		return iml.getInvestMoney();

	}
}

class InvestMoneyLoan{

	private static Lock lock = new ReentrantLock();
	private String id = "lo10000";
	private double loanMoney = 1000;
	private double investMoney;

	public boolean addMoney(double money) {
		try {
			lock.lock();
			if (investMoney + money > loanMoney) {
				return false;
			} else {
				setInvestMoney(investMoney + money);
			}
			System.out.println("addMoney:" + investMoney);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return true;
	}

	public boolean minusMoney(double money) {
		try {
			lock.lock();
			setInvestMoney(investMoney - money);
			System.out.println("minusMoney:" + investMoney);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return true;
	}

	public String getId() {
		return id;
	}

	public double getLoanMoney() {
		return loanMoney;
	}

	public double getInvestMoney() {
		return investMoney;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLoanMoney(double loanMoney) {
		this.loanMoney = loanMoney;
	}

	public void setInvestMoney(double investMoney) {
		this.investMoney = investMoney;
	}

}
