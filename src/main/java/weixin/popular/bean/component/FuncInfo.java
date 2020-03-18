package weixin.popular.bean.component;

public class FuncInfo {

	private FuncscopeCategory funcscope_category;

	private ConfirmInfo confirm_info;

	public static class FuncscopeCategory{
		private Integer id;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}

	public static class ConfirmInfo{
		private Integer need_confirm;
		private Integer already_confirm;
		private Integer can_confirm;

		public Integer getNeed_confirm() {
			return need_confirm;
		}

		public void setNeed_confirm(Integer need_confirm) {
			this.need_confirm = need_confirm;
		}

		public Integer getAlready_confirm() {
			return already_confirm;
		}

		public void setAlready_confirm(Integer already_confirm) {
			this.already_confirm = already_confirm;
		}

		public Integer getCan_confirm() {
			return can_confirm;
		}

		public void setCan_confirm(Integer can_confirm) {
			this.can_confirm = can_confirm;
		}
	}

	public FuncscopeCategory getFuncscope_category() {
		return funcscope_category;
	}

	public void setFuncscope_category(FuncscopeCategory funcscope_category) {
		this.funcscope_category = funcscope_category;
	}

	public ConfirmInfo getConfirm_info() {
		return confirm_info;
	}

	public void setConfirm_info(ConfirmInfo confirm_info) {
		this.confirm_info = confirm_info;
	}
}

