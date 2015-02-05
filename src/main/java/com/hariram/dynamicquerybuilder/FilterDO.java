package com.hariram.dynamicquerybuilder;

public class FilterDO {
	private String columnName = "";
	private String columnValue = "";
	private String columnCondition = "";
	
	public FilterDO() {
	}
	
	public FilterDO(String columnName, String columnValue,
			String columnCondition) {
		this.columnName = columnName;
		this.columnValue = columnValue;
		this.columnCondition = columnCondition;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnValue() {
		return columnValue;
	}

	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}

	public String getColumnCondition() {
		return columnCondition;
	}

	public void setColumnCondition(String columnCondition) {
		this.columnCondition = columnCondition;
	}
}
