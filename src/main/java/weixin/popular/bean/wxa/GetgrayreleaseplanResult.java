package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class GetgrayreleaseplanResult extends BaseResult {
    /** 分阶段发布计划详情 */
    private GrayReleasePlan gray_release_plan;

    public static class GrayReleasePlan {
        /** 0:初始状态 1:执行中 2:暂停中 3:执行完毕 4:被删除 */
        private Integer status;

        /** 分阶段发布计划的创建事件 */
        private Long create_timestamp;

        /** 当前的灰度比例 */
        private Integer gray_percentage;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Long getCreate_timestamp() {
            return create_timestamp;
        }

        public void setCreate_timestamp(Long create_timestamp) {
            this.create_timestamp = create_timestamp;
        }

        public Integer getGray_percentage() {
            return gray_percentage;
        }

        public void setGray_percentage(Integer gray_percentage) {
            this.gray_percentage = gray_percentage;
        }
    }

    public GrayReleasePlan getGray_release_plan() {
        return gray_release_plan;
    }

    public void setGray_release_plan(GrayReleasePlan gray_release_plan) {
        this.gray_release_plan = gray_release_plan;
    }
}
