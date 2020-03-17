package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

public class QuerynicknameResult extends BaseResult{

	/** 审核昵称 */
	private String nickname;

	/** 审核状态，1：审核中，2：审核失败，3：审核成功 */
	private Integer audit_stat;

	/** 失败原因 */
	private String fail_reason;

	/** 审核提交时间 */
	private Long create_time;

	/** 审核完成时间 */
	private Long audit_time;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAudit_stat() {
		return audit_stat;
	}

	public void setAudit_stat(Integer audit_stat) {
		this.audit_stat = audit_stat;
	}

	public String getFail_reason() {
		return fail_reason;
	}

	public void setFail_reason(String fail_reason) {
		this.fail_reason = fail_reason;
	}

	public Long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}

	public Long getAudit_time() {
		return audit_time;
	}

	public void setAudit_time(Long audit_time) {
		this.audit_time = audit_time;
	}
}
