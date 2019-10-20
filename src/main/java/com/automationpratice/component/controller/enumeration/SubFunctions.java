package com.automationpratice.component.controller.enumeration;

public enum SubFunctions {



	CATEGORY_WOMAN_SUB_TSHIRTS("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a", " ", ByPath.CATEGORY_WOMAN)


	;

	private String code;
	private String description;
	private ByPath byPath;

	SubFunctions(String code, String description, ByPath parent) {
		this.code = code;
		this.description = description;
		this.byPath = byPath;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public ByPath getParent() {
		return byPath;
	}
	
}
