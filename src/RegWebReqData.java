import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 富友开户 基于 鑫汇银行网贷平台资金存管系统接口规范V2.30.pdf Title: RegWebReqData Description:M 为必填 O
 * 为选填 Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年3月1日
 *
 */
public class RegWebReqData extends PData implements ReqData, Serializable{

	public static void main(String[] args) {
		ReqData a = new RegWebReqData();
		ReqData b = new RegWebReqData();
		b = FuiouOperationUtil.rspWebDataToBean(a);
		System.out.println(b.getSignature());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 194168902210376563L;
	/**
	 * //新接口文档的版本号 M
	 */
	private String ver = "v2.40";
	/**
	 * 接口编号，默认为四码开户 M
	 */
	private String code = "regUserByFive";
	/**
	 * 商户代码 M
	 */
	private String mchnt_cd = "mchnt_cd";
	/**
	 * 流水号 M
	 */
	private String mchnt_txn_ssn = "mchnt_txn_ssn";
	/**
	 * 网页类型 0-pc 1-app M
	 */
	private String client_tp = "client_tp";
	/**
	 * 银行预留手机号码 O
	 */
	private String mobile_no = "mobile_no";
	/**
	 * 用户姓名 O
	 */
	private String cust_nm = "cust_nm";
	/**
	 * 证件类型 O 默认为0 身份证
	 */
	private String certif_tp = "certif_tp";
	/**
	 * 证件号码 O
	 */
	private String certif_id = "certif_id";
	/**
	 * 用户属性usr_attr M 1.出借人 2.借款人5.代偿户 9.担保方手续费户
	 */
	private String usr_attr = "usr_attr";
	/**
	 * 邮箱地址 O
	 */
	private String email = "";
	/**
	 * 开户行地区代码 O
	 */
	private String city_id = "city_id";
	/**
	 * 开户行行别 O
	 */
	private String parent_bank_id = "parent_bank_id";
	/**
	 * 开户行支行名称
	 */
	private String bank_nm = "bank_nm";
	/**
	 * 银行卡号
	 */
	private String card_no = "card_no";// 帐号
	/**
	 * 授权状态
	 */
	private String auth_st = "auth_st";
	/**
	 * 自动出借授权期限
	 */
	private String auto_lend_term = "auto_lend_term";
	/**
	 * 自动授权出借额度
	 */
	private String auto_lend_amt = "auto_lend_amt";
	/**
	 * 自动还款授权期限
	 */
	private String auto_repay_term = "auto_repay_term";
	/**
	 * 自动还款授权额度
	 */
	private String auto_repay_amt = "auto_repay_amt";
	/**
	 * 自动代偿授权期限
	 */
	private String auto_compen_term = "auto_compen_term";
	/**
	 * 自动代偿授权额度
	 */
	private String auto_compen_amt = "auto_compen_amt";
	/**
	 * 缴费授权期限
	 */
	private String auto_fee_term = "auto_fee_term";
	/**
	 * 缴费授权额度
	 */
	private String auto_fee_amt = "auto_fee_amt";
	/**
	 * 商户返回地址
	 */
	private String page_notify_url = "www.aaa.com" + "/" + "page";
	/**
	 * 商户后台通知地址
	 */
	private String back_notify_url = "www.aaa.com" + "/" + "back";

	/*
	 * private String capAcntNm = "";// 户名 private String password = "";// 提现密码
	 * private String lpassword = "";// 登录密码 private String rem = "";// 备注
	 */

	public String getMchnt_cd() {
		return mchnt_cd;
	}

	@Override
	public String getSignature() {
		return FuiouOperationUtil.getSignature(this);
	}

	/**
	 * 商户号
	 * 
	 * @param mchnt_cd
	 */
	public void setMchnt_cd(String mchnt_cd) {
		this.mchnt_cd = mchnt_cd;
	}

	public String getMchnt_txn_ssn() {
		return mchnt_txn_ssn;
	}

	public void setMchnt_txn_ssn(String mchnt_txn_ssn) {
		this.mchnt_txn_ssn = mchnt_txn_ssn;
	}

	public String getCust_nm() {
		return cust_nm;
	}

	public void setCust_nm(String cust_nm) {
		this.cust_nm = cust_nm;
	}

	public String getCertif_tp() {
		return certif_tp;
	}

	public void setCertif_tp(String certif_tp) {
		this.certif_tp = certif_tp;
	}

	public String getCertif_id() {
		return certif_id;
	}

	public void setCertif_id(String certif_id) {
		this.certif_id = certif_id;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getParent_bank_id() {
		return parent_bank_id;
	}

	public void setParent_bank_id(String parent_bank_id) {
		this.parent_bank_id = parent_bank_id;
	}

	public String getBank_nm() {
		return bank_nm;
	}

	public void setBank_nm(String bank_nm) {
		this.bank_nm = bank_nm;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getCode() {
		return code;
	}

	public String getClient_tp() {
		return client_tp;
	}

	public String getUsr_attr() {
		return usr_attr;
	}

	public String getCard_no() {
		return card_no;
	}

	public String getAuth_st() {
		return auth_st;
	}

	public String getAuto_lend_term() {
		return auto_lend_term;
	}

	public String getAuto_lend_amt() {
		return auto_lend_amt;
	}

	public String getAuto_repay_term() {
		return auto_repay_term;
	}

	public String getAuto_repay_amt() {
		return auto_repay_amt;
	}

	public String getAuto_compen_term() {
		return auto_compen_term;
	}

	public String getAuto_compen_amt() {
		return auto_compen_amt;
	}

	public String getAuto_fee_term() {
		return auto_fee_term;
	}

	public String getAuto_fee_amt() {
		return auto_fee_amt;
	}

	public String getPage_notify_url() {
		return page_notify_url;
	}

	public String getBack_notify_url() {
		return back_notify_url;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setClient_tp(String client_tp) {
		this.client_tp = client_tp;
	}

	public void setUsr_attr(String usr_attr) {
		this.usr_attr = usr_attr;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public void setAuth_st(String auth_st) {
		this.auth_st = auth_st;
	}

	public void setAuto_lend_term(String auto_lend_term) {
		this.auto_lend_term = auto_lend_term;
	}

	public void setAuto_lend_amt(String auto_lend_amt) {
		this.auto_lend_amt = auto_lend_amt;
	}

	public void setAuto_repay_term(String auto_repay_term) {
		this.auto_repay_term = auto_repay_term;
	}

	public void setAuto_repay_amt(String auto_repay_amt) {
		this.auto_repay_amt = auto_repay_amt;
	}

	public void setAuto_compen_term(String auto_compen_term) {
		this.auto_compen_term = auto_compen_term;
	}

	public void setAuto_compen_amt(String auto_compen_amt) {
		this.auto_compen_amt = auto_compen_amt;
	}

	public void setAuto_fee_term(String auto_fee_term) {
		this.auto_fee_term = auto_fee_term;
	}

	public void setAuto_fee_amt(String auto_fee_amt) {
		this.auto_fee_amt = auto_fee_amt;
	}

	public void setPage_notify_url(String page_notify_url) {
		this.page_notify_url = page_notify_url;
	}

	public void setBack_notify_url(String back_notify_url) {
		this.back_notify_url = back_notify_url;
	}

}
