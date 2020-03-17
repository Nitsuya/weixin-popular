package weixin.popular.bean.card.paygiftcard;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author Nitsuya
 */
public class BaseInfo {

    /** 商户号列表，是一个数组结构，建议单次请求100个以下商户号 */
    @JSONField(name = "mchid_list")
    private List<String> mchidList;

    /** 规则开始时间 */
    @JSONField(name = "begin_time")
    private Integer beginTime;

    /** 规则结束时间 */
    @JSONField(name = "end_time")
    private Integer endTime;

    //-------------------------- 以下为查询时返回 ---------------------
    /** 状态 */
    private String status;

    /** 创建时间 */
    @JSONField(name = "create_time")
    private Integer createTime;

    /** 更新时间 */
    @JSONField(name = "update_time")
    private Integer updateTime;

    public List<String> getMchidList() {
        return mchidList;
    }

    public void setMchidList(List<String> mchidList) {
        this.mchidList = mchidList;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}
