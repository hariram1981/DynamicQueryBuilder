package com.hariram.dynamicquerybuilder;

import java.util.List;

public class JoinFilterUtil {
	
	public enum JOIN_TYPE {INNER, LEFT, RIGHT};
	
	public static String getConditions(List<JoinFilterDO> joinfilterList) {
		final StringBuffer strBuff = new StringBuffer();
		joinfilterList.stream()
				.forEach(e -> {
					if(strBuff.toString().equals("")) {
						strBuff.append("SELECT");
						strBuff.append("  ");
						strBuff.append(getSelectColumns(e));
					} else {
						strBuff.append("  ");
						}
					strBuff.append(getSelect(e));
				});	
		return strBuff.toString();
	}
	private static String getSelect(JoinFilterDO joinfilterDO) {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(" FROM ");
		strBuff.append(joinfilterDO.getFirstTable());
		strBuff.append(" "+joinfilterDO.getJoinType()+" JOIN ");
		strBuff.append(joinfilterDO.getSecondTable());
		strBuff.append(" ON ");
		strBuff.append(joinfilterDO.getFirstTable()+"."+joinfilterDO.getColumnName());
		strBuff.append("=");
		strBuff.append(joinfilterDO.getSecondTable()+"."+joinfilterDO.getColumnName());			

		return strBuff.toString();
	}
	private static String getSelectColumns(JoinFilterDO joinfilterDO) {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(joinfilterDO.getListColumn());
		return strBuff.toString();
	}
}
