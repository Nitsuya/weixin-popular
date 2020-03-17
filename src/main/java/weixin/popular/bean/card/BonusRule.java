package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 积分规则
 *
 * @author Nitsuya
 *
 */
public class BonusRule {
    /** 消费金额。以分为单位 */
    @JSONField(name = "cost_money_unit")
    private Integer costMoneyUnit;

    /** 对应增加的积分 */
    @JSONField(name = "increase_bonus")
    private Integer increaseBonus;

    /** 用户单次可获取的积分上限 */
    @JSONField(name = "max_increase_bonus")
    private Integer maxIncreaseBonus;

    /** 初始设置积分 */
    @JSONField(name = "init_increase_bonus")
    private Integer initIncreaseBonus;

    /** 每使用X积分 */
    @JSONField(name = "cost_bonus_unit")
    private Integer costBonusUnit;

    /** 抵扣xx元。以分为单位*/
    @JSONField(name = "reduce_money")
    private Integer reduceMoney;

    /** 抵扣条件，满xx元可用。以分为单位*/
    @JSONField(name = "least_money_to_use_bonus")
    private Integer leastMoneyToUseBonus;

    /** 抵扣条件，单笔最多使用xx积分*/
    @JSONField(name = "max_reduce_bonus")
    private Integer maxReduceBonus;
}
