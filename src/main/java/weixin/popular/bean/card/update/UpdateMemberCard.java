/**
 * 
 */
package weixin.popular.bean.card.update;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.card.MemberCard;

/**
 * 微信卡券－会员卡专区－管理会员卡－更改会员卡信息接口－请求参数
 * @author Nitsuya
 */
public class UpdateMemberCard extends AbstractUpdate {
	
	/** 会员卡 */
	@JSONField(name = "member_card")
	private MemberCard memberCard;

	public MemberCard getMemberCard() {
		return memberCard;
	}

	public void setMemberCard(MemberCard memberCard) {
		this.memberCard = memberCard;
	}
}
