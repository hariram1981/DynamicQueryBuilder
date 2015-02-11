package com.hariram.dynamicquerybuilder;

import com.hariram.dynamicquerybuilder.FilterUtil.FILTER_CONDITION;

public class FilterDO {
	private String columnName = "";
	private String columnValue = "";
	private FILTER_CONDITION columnCondition = FILTER_CONDITION.EQUAL;
	
	public FilterDO() {
	}
	
	public FilterDO(String columnName, String columnValue,
			FILTER_CONDITION columnCondition) {
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

	public FILTER_CONDITION getColumnCondition() {
		return columnCondition;
	}

	public void setColumnCondition(FILTER_CONDITION columnCondition) {
		this.columnCondition = columnCondition;
	}
}
