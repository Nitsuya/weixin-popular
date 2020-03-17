package weixin.popular.bean.card;

/**
 * 会员卡
 * 
 * @author Nitsuya
 *
 */
public class MemberCardCard extends AbstractCard {

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
