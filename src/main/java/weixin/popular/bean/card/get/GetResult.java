package weixin.popular.bean.card.get;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.AbstractCard;

/**
 * 
 * @author Moyq5
 *
 * @param <T>可以是CashCard、DiscountCard、GeneralCouponCard、GiftCard、GrouponCard、MemberCardCard
 */
public abstract class GetResult<T extends AbstractCard> extends BaseResult {

	private T card;

	public T getCard() {
		return card;
	}

	public void setCard(T card) {
		this.card = card;
	}

	public <R extends GetResult> R restore(){
		if(!this.isSuccess()){
			return null;
		}
		return (R)this;
	}
}