package com.hariram.dynamicquerybuilder;

import java.util.List;

public final class FilterUtil {

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
		strBuff.append(filterDO.getColumnCondition());
		strBuff.append(" ");
		strBuff.append("'");
		strBuff.append(filterDO.getColumnValue());
		strBuff.append("'");
		
		return strBuff.toString();
	}

}
