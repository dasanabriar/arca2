package com.arca.app.enums;

public enum ShoppingCartStatusEnum {
	ACTIVE("ACT", "Activo"), 
	COMPLETE("COMP", "Completada");
	
	private String code;
	private String description;

	ShoppingCartStatusEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
