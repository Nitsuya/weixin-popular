package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

public class SetnicknameResult extends BaseResult{
	/** 材料说明 */
	private String wording;

	/** 审核单 id，通过用于查询改名审核状态 */
	private Integer audit_id;

	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}

	public Integer getAudit_id() {
		return audit_id;
	}

	public void setAudit_id(Integer audit_id) {
		this.audit_id = audit_id;
	}
}
