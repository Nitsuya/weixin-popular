package weixin.popular.bean.account;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class GetaccountbasicinfoResult extends BaseResult {
    /** 帐号 appid */
    private String appid;

    /** 帐号类型（1：订阅号，2：服务号，3：小程序） */
    private Integer account_type;

    /** 主体类型(0 个人 1企业 2媒体 3政府 4其他组织) */
    private Integer principal_type;

    /** 主体名称 */
    private String principal_name;

    /** 实名验证状态(1实名验证成功 2实名验证中 3实名验证失败) */
    private Integer realname_status;

    /** 微信认证信息 */
    private WxVerifyInfo wx_verify_info;

    /** 功能介绍信息 */
    private SignatureInfo signature_info;

    /** 头像信息 */
    private HeadImageInfo head_image_info;


    public static class WxVerifyInfo{

        /** 是否资质认证，若是，拥有微信认证相关的权限 */
        private Boolean qualification_verify;

        /** 是否名称认证 */
        private Boolean naming_verify;

        /** 是否需要年审（qualification_verify == true 时才有该字段） */
        private Boolean annual_review;

        /** 年审开始时间，时间戳（qualification_verify == true 时才有该字段） */
        private Long annual_review_begin_time;

        /** 年审截止时间，时间戳（qualification_verify == true 时才有该字段） */
        private Long annual_review_end_time;

        public Boolean getQualification_verify() {
            return qualification_verify;
        }

        public void setQualification_verify(Boolean qualification_verify) {
            this.qualification_verify = qualification_verify;
        }

        public Boolean getNaming_verify() {
            return naming_verify;
        }

        public void setNaming_verify(Boolean naming_verify) {
            this.naming_verify = naming_verify;
        }

        public Boolean getAnnual_review() {
            return annual_review;
        }

        public void setAnnual_review(Boolean annual_review) {
            this.annual_review = annual_review;
        }

        public Long getAnnual_review_begin_time() {
            return annual_review_begin_time;
        }

        public void setAnnual_review_begin_time(Long annual_review_begin_time) {
            this.annual_review_begin_time = annual_review_begin_time;
        }

        public Long getAnnual_review_end_time() {
            return annual_review_end_time;
        }

        public void setAnnual_review_end_time(Long annual_review_end_time) {
            this.annual_review_end_time = annual_review_end_time;
        }
    }

    public static class SignatureInfo{
        /** 功能介绍 */
        private String signature;

        /** 功能介绍已使用修改次数（本月） */
        private Integer modify_used_count;

        /** 功能介绍修改次数总额度（本月） */
        private Integer modify_quota;

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public Integer getModify_used_count() {
            return modify_used_count;
        }

        public void setModify_used_count(Integer modify_used_count) {
            this.modify_used_count = modify_used_count;
        }

        public Integer getModify_quota() {
            return modify_quota;
        }

        public void setModify_quota(Integer modify_quota) {
            this.modify_quota = modify_quota;
        }
    }

    public static class HeadImageInfo{
        /** 头像url */
        private String head_image_url;

        /** 头像已使用修改次数（本月） */
        private Integer modify_used_count;

        /** 头像修改次数总额度（本月） */
        private Integer modify_quota;

        public String getHead_image_url() {
            return head_image_url;
        }

        public void setHead_image_url(String head_image_url) {
            this.head_image_url = head_image_url;
        }

        public Integer getModify_used_count() {
            return modify_used_count;
        }

        public void setModify_used_count(Integer modify_used_count) {
            this.modify_used_count = modify_used_count;
        }

        public Integer getModify_quota() {
            return modify_quota;
        }

        public void setModify_quota(Integer modify_quota) {
            this.modify_quota = modify_quota;
        }
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Integer getAccount_type() {
        return account_type;
    }

    public void setAccount_type(Integer account_type) {
        this.account_type = account_type;
    }

    public Integer getPrincipal_type() {
        return principal_type;
    }

    public void setPrincipal_type(Integer principal_type) {
        this.principal_type = principal_type;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    public Integer getRealname_status() {
        return realname_status;
    }

    public void setRealname_status(Integer realname_status) {
        this.realname_status = realname_status;
    }

    public WxVerifyInfo getWx_verify_info() {
        return wx_verify_info;
    }

    public void setWx_verify_info(WxVerifyInfo wx_verify_info) {
        this.wx_verify_info = wx_verify_info;
    }

    public SignatureInfo getSignature_info() {
        return signature_info;
    }

    public void setSignature_info(SignatureInfo signature_info) {
        this.signature_info = signature_info;
    }

    public HeadImageInfo getHead_image_info() {
        return head_image_info;
    }

    public void setHead_image_info(HeadImageInfo head_image_info) {
        this.head_image_info = head_image_info;
    }
}
