package weixin.popular.bean.card.membercard.activatetempinfo.get;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.membercard.UserInfo;

/**
 * 微信卡券－会员卡专区－创建会员卡-获取用户提交资料-响应参数
 * @author Nitsuya
 */
public class MembercardActivatetempinfoGetResult extends BaseResult {

    /** 信息 */
    private UserInfo info;

    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }
}
