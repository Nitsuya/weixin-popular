package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 会员卡
 *
 * @author Nitsuya
 *
 */
public class MemberCard extends AbstractInfo {

	// region [会员卡激活] ===============================================================================================
	// 4种微信会员卡激活模式
	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────
	// [自动激活] autoActivate
	// 会员卡主页{点击领取}　┌>　会员卡主页{已激活}
	//　　　　　　　　　　   └>　异步推送[user_get_card]事件
	// 注: 1.无法开启官方开卡字段
	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────

	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────
	// [接口激活] activateUrl 或 activateAppBrandUserName + activateAppBrandPass
	// 会员卡主页{点击领取}　┌>　会员卡主页{未激活}{点击激活}　─>　跳转网页/小程序页面,携带参数　─>　自己处理逻辑,Code主动激活会员卡
	// 　　　　　　　　　　  └>　异步推送[user_get_card]事件
	// 注:　1. 无法开启官方开卡字段
	//     2. 请把 autoActivate 和 wxActivate 设置为 false, 防止这种模式不生效的问题
	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────

	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────
	// [一键激活] wxActivate
	// 会员卡主页{点击领取}　┌>　会员卡主页{未激活}{点击激活}　─>　跳转官方页面填写开卡字段{点击激活}　┌>　会员卡主页{已激活}
	// 　　　　　　　　　　  └>　异步推送[user_get_card]事件　　　　　　　　　　　　　　　　　　　　 └>　异步推送[submit_membercard_user_info]事件
	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────

	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────
	// [跳转型一键激活] wxActivate + wxActivateAfterSubmit + wxActivateAfterSubmitUrl
	// 注册新会员　─>　跳转官方开卡页面填写资料　─>　用户点击激活　─>　跳转自定义页面携带参数,换取用户填写资料,使用Code主动激活会员卡
	// ────────────────────────────────────────────────────────────────────────────────────────────────────────────
	/**
	 * [自动激活]
	 * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口
	 * */
	@JSONField(name = "auto_activate")
	private Boolean autoActivate;

	/**
	 * [接口激活]
	 * 激活会员卡的url
	 * */
	@JSONField(name = "activate_url")
	private String activateUrl;

	/**
	 * [接口激活]
	 * 激活会员卡的小程序user_name，仅可跳转该公众号绑定的小程序，[原始ID+@app]
	 * */
	@JSONField(name = "activate_app_brand_user_name")
	private String activateAppBrandUserName;

	/**
	 * [接口激活]
	 * 激活会员卡的小程序path
	 * */
	@JSONField(name = "activate_app_brand_pass")
	private String activateAppBrandPass;

	/**
	 * [一键激活、跳转型一键激活]
	 * 设置为true时会员卡支持一键开卡，不允许同时传入activate_url字段，否则设置wx_activate失效。填入该字段后仍需调用接口设置开卡项方可生效
	 * */
	@JSONField(name = "wx_activate")
	private Boolean wxActivate;

	/**
	 * [跳转型一键激活]
	 * 是否支持跳转型一键激活
	 * */
	@JSONField(name = "wx_activate_after_submit")
	private Boolean wxActivateAfterSubmit;

	/**
	 * [跳转型一键激活]
	 * 跳转型一键激活跳转的地址链接
	 * */
	@JSONField(name = "wx_activate_after_submit_url")
	private String wxActivateAfterSubmitUrl;

	/**
	 * TODO 待测试
	 * [跳转型一键激活]
	 * 跳转型一键激活跳转的小程序user_name
	 * */
	@JSONField(name = "wx_activate_after_submit_app_brand_user_name")
	private String wxActivateAfterSubmitAppBrandUserName;

	/**
	 * TODO 待测试
	 * [跳转型一键激活]
	 * 跳转型一键激活跳转的小程序path
	 * */
	@JSONField(name = "wx_activate_after_submit_app_brand_pass")
	private String wxActivateAfterSubmitAppBrandPass;

	// endregion =======================================================================================================


	// region [信息类目Field] 积分,储值,自定义1,自定义2,自定义3 ==============================================================
	// 创建时类目字段supply_bonus 、supply_balance、 custom_field1、custom_field2 、custom_field3 最多选择三项填写
    //----- 积分
	/**
	 * 显示积分，填写true或false，如填写true，积分相关字段均为必填
	 * 添加必填，设置为true则后续不可以被关闭
	 * */
	@JSONField(name = "supply_bonus")
	private boolean supplyBonus;

	/** 设置跳转外链查看积分详情 */
	@JSONField(name = "bonus_url")
	private String bonusUrl;

    /** 设置跳转小程序user_name查看积分详情 [原始ID+@app] */
    @JSONField(name = "bonus_app_brand_user_name")
    private String bonusAppBrandUserName;

    /** 设置跳转小程序页面查看积分详情 */
    @JSONField(name = "bonus_app_brand_pass")
    private String bonusAppBrandPass;

    //----- 储值
	/**
	 * 是否支持储值，填写true或false。如填写true，储值相关字段均为必填。该字段须开通储值功能后方可使用
	 * 添加必填，设置为true则后续不可以被关闭
	 * */
	@JSONField(name = "supply_balance")
	private boolean supplyBalance;

	/** 设置跳转外链查看余额详情 */
	@JSONField(name = "balance_url")
	private String balanceUrl;

    /** 设置跳转小程序user_name查看余额详情 [原始ID+@app] */
    @JSONField(name = "balance_app_brand_user_name")
    private String balanceAppBrandUserName;

    /** 设置跳转小程序页面查看余额详情 */
    @JSONField(name = "balance_app_brand_pass")
    private String balanceAppBrandPass;

    //----- 自定义
	/** 自定义信息类目1 */
	@JSONField(name = "custom_field1")
	private CustomCell customField1;

	/** 自定义信息类目2 */
	@JSONField(name = "custom_field2")
	private CustomCell customField2;

	/** 自定义信息类目3 */
	@JSONField(name = "custom_field3")
	private CustomCell customField3;
	// endregion =======================================================================================================


	// region [信息类目Cell] 自定义1 =====================================================================================
	// 展示顺序:
    // 1.[baseInfo.custom]
    // 2.[customCell1]
    // 3.[customCell2]
    // 4.[baseInfo.promotion] -> 未激活会员卡时,也会显示该入口
	/** 自定义信息类目1 */
	@JSONField(name = "custom_cell1")
	private CustomCell customCell1;

    /** 自定义信息类目2 */
    @JSONField(name = "custom_cell2")
    private CustomCell customCell2;
	// endregion =======================================================================================================


	// region [其他属性] ================================================================================================
	//
	/** 商家自定义会员卡背景图，须先调用上传图片接口将背景图上传至CDN，否则报错，卡面设计请遵循微信会员卡自定义背景设计规范,像素大小控制在1000像素*600像素以下 */
	@JSONField(name = "background_pic_url")
	private String backgroundPicUrl;
	/**
	 * 会员卡特权说明,限制1024汉字
	 * 添加必填
	 * */
	private String prerogative;

	/** 折扣，该会员卡享受的折扣优惠,填10就是九折*/
	private Integer discount;

	/** 积分清零规则 */
	@JSONField(name = "bonus_cleared")
	private String bonusCleared;

	/** 积分规则 */
	@JSONField(name = "bonus_rules")
	private String bonusRules;

	/** 积分规则 */
	@JSONField(name = "bonus_rule")
	private BonusRule bonusRule;

	/** 储值说明 */
	@JSONField(name = "balance_rules")
	private String balanceRules;

	// endregion =======================================================================================================


	/** 推荐类型，代表会员卡激活消息赠券 */
	@JSONField(name = "activate_msg_operation")
	private MsgOperation activateMsgOperation;

	/** 推荐类型，代表积分余额等变动消息赠券 */
	@JSONField(name = "modify_msg_operation")
	private MsgOperation modifyMsgOperation;


	public Boolean getAutoActivate() {
		return autoActivate;
	}

	public void setAutoActivate(Boolean autoActivate) {
		this.autoActivate = autoActivate;
	}

	public String getActivateUrl() {
		return activateUrl;
	}

	public void setActivateUrl(String activateUrl) {
		this.activateUrl = activateUrl;
	}

	public String getActivateAppBrandUserName() {
		return activateAppBrandUserName;
	}

	public void setActivateAppBrandUserName(String activateAppBrandUserName) {
		this.activateAppBrandUserName = activateAppBrandUserName;
	}

	public String getActivateAppBrandPass() {
		return activateAppBrandPass;
	}

	public void setActivateAppBrandPass(String activateAppBrandPass) {
		this.activateAppBrandPass = activateAppBrandPass;
	}

	public Boolean getWxActivate() {
		return wxActivate;
	}

	public void setWxActivate(Boolean wxActivate) {
		this.wxActivate = wxActivate;
	}

	public Boolean getWxActivateAfterSubmit() {
		return wxActivateAfterSubmit;
	}

	public void setWxActivateAfterSubmit(Boolean wxActivateAfterSubmit) {
		this.wxActivateAfterSubmit = wxActivateAfterSubmit;
	}

	public String getWxActivateAfterSubmitUrl() {
		return wxActivateAfterSubmitUrl;
	}

	public void setWxActivateAfterSubmitUrl(String wxActivateAfterSubmitUrl) {
		this.wxActivateAfterSubmitUrl = wxActivateAfterSubmitUrl;
	}

	public String getWxActivateAfterSubmitAppBrandUserName() {
		return wxActivateAfterSubmitAppBrandUserName;
	}

	public void setWxActivateAfterSubmitAppBrandUserName(String wxActivateAfterSubmitAppBrandUserName) {
		this.wxActivateAfterSubmitAppBrandUserName = wxActivateAfterSubmitAppBrandUserName;
	}

	public String getWxActivateAfterSubmitAppBrandPass() {
		return wxActivateAfterSubmitAppBrandPass;
	}

	public void setWxActivateAfterSubmitAppBrandPass(String wxActivateAfterSubmitAppBrandPass) {
		this.wxActivateAfterSubmitAppBrandPass = wxActivateAfterSubmitAppBrandPass;
	}

	public boolean isSupplyBonus() {
		return supplyBonus;
	}

	public void setSupplyBonus(boolean supplyBonus) {
		this.supplyBonus = supplyBonus;
	}

	public String getBonusUrl() {
		return bonusUrl;
	}

	public void setBonusUrl(String bonusUrl) {
		this.bonusUrl = bonusUrl;
	}

	public String getBonusAppBrandUserName() {
		return bonusAppBrandUserName;
	}

	public void setBonusAppBrandUserName(String bonusAppBrandUserName) {
		this.bonusAppBrandUserName = bonusAppBrandUserName;
	}

	public String getBonusAppBrandPass() {
		return bonusAppBrandPass;
	}

	public void setBonusAppBrandPass(String bonusAppBrandPass) {
		this.bonusAppBrandPass = bonusAppBrandPass;
	}

	public boolean isSupplyBalance() {
		return supplyBalance;
	}

	public void setSupplyBalance(boolean supplyBalance) {
		this.supplyBalance = supplyBalance;
	}

	public String getBalanceUrl() {
		return balanceUrl;
	}

	public void setBalanceUrl(String balanceUrl) {
		this.balanceUrl = balanceUrl;
	}

	public String getBalanceAppBrandUserName() {
		return balanceAppBrandUserName;
	}

	public void setBalanceAppBrandUserName(String balanceAppBrandUserName) {
		this.balanceAppBrandUserName = balanceAppBrandUserName;
	}

	public String getBalanceAppBrandPass() {
		return balanceAppBrandPass;
	}

	public void setBalanceAppBrandPass(String balanceAppBrandPass) {
		this.balanceAppBrandPass = balanceAppBrandPass;
	}

	public CustomCell getCustomField1() {
		return customField1;
	}

	public void setCustomField1(CustomCell customField1) {
		this.customField1 = customField1;
	}

	public CustomCell getCustomField2() {
		return customField2;
	}

	public void setCustomField2(CustomCell customField2) {
		this.customField2 = customField2;
	}

	public CustomCell getCustomField3() {
		return customField3;
	}

	public void setCustomField3(CustomCell customField3) {
		this.customField3 = customField3;
	}

	public CustomCell getCustomCell1() {
		return customCell1;
	}

	public void setCustomCell1(CustomCell customCell1) {
		this.customCell1 = customCell1;
	}

	public CustomCell getCustomCell2() {
		return customCell2;
	}

	public void setCustomCell2(CustomCell customCell2) {
		this.customCell2 = customCell2;
	}

	public String getBackgroundPicUrl() {
		return backgroundPicUrl;
	}

	public void setBackgroundPicUrl(String backgroundPicUrl) {
		this.backgroundPicUrl = backgroundPicUrl;
	}

	public String getPrerogative() {
		return prerogative;
	}

	public void setPrerogative(String prerogative) {
		this.prerogative = prerogative;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getBonusCleared() {
		return bonusCleared;
	}

	public void setBonusCleared(String bonusCleared) {
		this.bonusCleared = bonusCleared;
	}

	public String getBonusRules() {
		return bonusRules;
	}

	public void setBonusRules(String bonusRules) {
		this.bonusRules = bonusRules;
	}

	public BonusRule getBonusRule() {
		return bonusRule;
	}

	public void setBonusRule(BonusRule bonusRule) {
		this.bonusRule = bonusRule;
	}

	public String getBalanceRules() {
		return balanceRules;
	}

	public void setBalanceRules(String balanceRules) {
		this.balanceRules = balanceRules;
	}

	public MsgOperation getActivateMsgOperation() {
		return activateMsgOperation;
	}

	public void setActivateMsgOperation(MsgOperation activateMsgOperation) {
		this.activateMsgOperation = activateMsgOperation;
	}

	public MsgOperation getModifyMsgOperation() {
		return modifyMsgOperation;
	}

	public void setModifyMsgOperation(MsgOperation modifyMsgOperation) {
		this.modifyMsgOperation = modifyMsgOperation;
	}
}
