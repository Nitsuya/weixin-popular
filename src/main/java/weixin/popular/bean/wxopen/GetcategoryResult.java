package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class GetcategoryResult extends BaseResult {

    /** 已设置的类目信息列表 */
    private List<Category> categories;

    /** 一个更改周期内可以添加类目的次数 */
    private Integer limit;

    /** 本更改周期内还可以添加类目的次数 */
    private Integer quota;

    /** 最多可以设置的类目数量 */
    private Integer category_limit;

    public static class Category {
        /** 一级类目 ID */
        private Integer first;

        /** 一级类目名称 */
        private String first_name;

        /** 二级类目 ID */
        private Integer second;

        /** 二级类目名称 */
        private String second_name;

        /** 审核状态（1 审核中 2 审核不通过 3 审核通过） */
        private Integer audit_status;

        /** 审核不通过的原因 */
        private String audit_reason;

        public Integer getFirst() {
            return first;
        }

        public void setFirst(Integer first) {
            this.first = first;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public Integer getSecond() {
            return second;
        }

        public void setSecond(Integer second) {
            this.second = second;
        }

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

        public Integer getAudit_status() {
            return audit_status;
        }

        public void setAudit_status(Integer audit_status) {
            this.audit_status = audit_status;
        }

        public String getAudit_reason() {
            return audit_reason;
        }

        public void setAudit_reason(String audit_reason) {
            this.audit_reason = audit_reason;
        }
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getCategory_limit() {
        return category_limit;
    }

    public void setCategory_limit(Integer category_limit) {
        this.category_limit = category_limit;
    }
}
