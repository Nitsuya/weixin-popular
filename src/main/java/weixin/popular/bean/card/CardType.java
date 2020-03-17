package weixin.popular.bean.card;

/**
 * 卡券类型
 * 
 * @author Moyq5
 *
 */
public enum CardType {
	//---------基本卡券
	/** 团购券 */
	GROUPON,

	/** 折扣券 */
	DISCOUNT,

	/** 兑换券(礼品券) */
	GIFT,

	/** 代金券 */
	CASH,

	/** 通用券*/
	GENERAL_COUPON,

	//---------会员卡券
	/** 会员卡 */
	MEMBER_CARD,

	//---------特殊票券
	/** 会议门票 */
	MEETING_TICKET,

	/** 景点门票 */
	SCENIC_TICKET,

	/** 电影票 */
	MOVIE_TICKET,

	/** 飞机票 */
	BOARDING_PASS,

	/** 汽车票 */
	BUS_TICKET;
}
