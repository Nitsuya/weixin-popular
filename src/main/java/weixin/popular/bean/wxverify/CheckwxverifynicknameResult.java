package weixin.popular.bean.wxverify;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class CheckwxverifynicknameResult extends BaseResult {

    /** 是否命中关键字策略。若命中，可以选填关键字材料*/
    private boolean hit_condition;

    /** 命中关键字的说明描述*/
    private String wording;

    public boolean isHit_condition() {
        return hit_condition;
    }

    public void setHit_condition(boolean hit_condition) {
        this.hit_condition = hit_condition;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }
}
