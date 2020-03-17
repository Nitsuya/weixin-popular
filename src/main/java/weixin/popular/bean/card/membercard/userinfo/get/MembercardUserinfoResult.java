package weixin.popular.bean.card.membercard.userinfo.get;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.membercard.UserInfo;

/**
 * 创建会员卡-拉取会员信息接口-响应参数
 * @author Nitsuya
 */
public class MembercardUserinfoResult extends BaseResult {

    /** 用户在本公众号内唯一识别码 */
    private String openid;

    /** 用户昵称 */
    private String nickname;

    @JSONField(name = "membership_number")
    private String membershipNumber;

    /** 积分信息 */
    private String bonus;

    /** 余额信息 */
    private String balance;

    /** 用户性别 */
    private String sex;

    /** 会员信息 */
    @JSONField(name = "user_info")
    private UserInfo userInfo;

    /**
     * 当前用户的会员卡状态
     * NORMAL 正常
     * EXPIRE 已过期
     * GIFTING 转赠中
     * GIFT_SUCC 转赠成功
     * GIFT_TIMEOUT 转赠超时
     * DELETE 已删除
     * UNAVAILABLE 已失效
     * */
    @JSONField(name = "user_card_status")
    private String userCardStatus;

    /** 该卡是否已经被激活，true表示已经被激活，false表示未被激活 */
    @JSONField(name = "has_active")
    private Boolean hasActive;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getUserCardStatus() {
        return userCardStatus;
    }

    public void setUserCardStatus(String userCardStatus) {
        this.userCardStatus = userCardStatus;
    }

    public Boolean getHasActive() {
        return hasActive;
    }

    public void setHasActive(Boolean hasActive) {
        this.hasActive = hasActive;
    }
}
