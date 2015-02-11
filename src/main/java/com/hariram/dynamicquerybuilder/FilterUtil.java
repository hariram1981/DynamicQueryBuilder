package com.hariram.dynamicquerybuilder;

import java.util.List;

public final class FilterUtil {

	public enum FILTER_CONDITION {GREATER, LESSER, EQUAL};
	
	private FilterUtil() {
	}
	
	public static String getConditions(List<FilterDO> filterList) {
		final StringBuffer strBuff = new StringBuffer();
		filterList.stream()
				.forEach(e -> {
					if(strBuff.toString().equals("")) {
						strBuff.append("WHERE ");
					} else {
						strBuff.append(" AND ");
					}
					strBuff.append(getWhere(e));
				});
		return strBuff.toString();
	}
	
	private static String getWhere(FilterDO filterDO) {
		StringBuffer strBuff = new StringBuffer();
		
		strBuff.append(filterDO.getColumnName());
		strBuff.append(" ");
		strBuff.append(getConditionString(filterDO.getColumnCondition()));
		strBuff.append(" ");
		strBuff.append("'");
		strBuff.append(filterDO.getColumnValue());
		strBuff.append("'");
		
		return strBuff.toString();
	}
	
	/**
	 * Returns filter condition as string (from enum)
	 * 
	 * @param filterCondition condition of filter 
	 * @return condition of filter as String
	 */
	private static String getConditionString(FILTER_CONDITION filterCondition) {
		String conditionStr = "";
		switch(filterCondition) {
			case GREATER:
				conditionStr = ">";
				break;
			case LESSER:
				conditionStr = "<";
				break;
			case EQUAL:
				conditionStr = "=";
				break;
			default:
				conditionStr = "=";
				break;
		}
		return conditionStr;
	}

}
