package weixin.popular.bean.card.membercard.updateuser;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.BaseResult;

/**
 * 微信卡券－会员卡专区－创建会员卡-拉取会员信息接口-响应参数
 * @author Nitsuya
 */
public class MembercardUpdateuserResult extends BaseResult {

    /** 用户openid */
    private String openid;

    /** 当前用户积分总额 */
    @JSONField(name = "result_bonus")
    private Integer resultBonus;

    /** 当前用户预存总金额 */
    @JSONField(name = "result_balance")
    private Integer resultBalance;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getResultBonus() {
        return resultBonus;
    }

    public void setResultBonus(Integer resultBonus) {
        this.resultBonus = resultBonus;
    }

    public Integer getResultBalance() {
        return resultBalance;
    }

    public void setResultBalance(Integer resultBalance) {
        this.resultBalance = resultBalance;
    }
}
