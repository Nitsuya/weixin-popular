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

    public Integer getCostMoneyUnit() {
        return costMoneyUnit;
    }

    public void setCostMoneyUnit(Integer costMoneyUnit) {
        this.costMoneyUnit = costMoneyUnit;
    }

    public Integer getIncreaseBonus() {
        return increaseBonus;
    }

    public void setIncreaseBonus(Integer increaseBonus) {
        this.increaseBonus = increaseBonus;
    }

    public Integer getMaxIncreaseBonus() {
        return maxIncreaseBonus;
    }

    public void setMaxIncreaseBonus(Integer maxIncreaseBonus) {
        this.maxIncreaseBonus = maxIncreaseBonus;
    }

    public Integer getInitIncreaseBonus() {
        return initIncreaseBonus;
    }

    public void setInitIncreaseBonus(Integer initIncreaseBonus) {
        this.initIncreaseBonus = initIncreaseBonus;
    }

    public Integer getCostBonusUnit() {
        return costBonusUnit;
    }

    public void setCostBonusUnit(Integer costBonusUnit) {
        this.costBonusUnit = costBonusUnit;
    }

    public Integer getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(Integer reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public Integer getLeastMoneyToUseBonus() {
        return leastMoneyToUseBonus;
    }

    public void setLeastMoneyToUseBonus(Integer leastMoneyToUseBonus) {
        this.leastMoneyToUseBonus = leastMoneyToUseBonus;
    }

    public Integer getMaxReduceBonus() {
        return maxReduceBonus;
    }

    public void setMaxReduceBonus(Integer maxReduceBonus) {
        this.maxReduceBonus = maxReduceBonus;
    }
}
