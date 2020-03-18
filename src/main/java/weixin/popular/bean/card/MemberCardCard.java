package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 会员卡
 * 
 * @author Nitsuya
 *
 */
public class MemberCardCard extends AbstractCard {

	@JSONField(name = "member_card")
	private MemberCard memberCard;

	public MemberCardCard() {
		super("MEMBER_CARD");
	}

	public MemberCard getMemberCard() {
		return memberCard;
	}

	public void setMemberCard(MemberCard memberCard) {
		this.memberCard = memberCard;
	}
}
