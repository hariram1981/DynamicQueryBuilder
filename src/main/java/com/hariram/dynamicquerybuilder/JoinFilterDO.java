package com.hariram.dynamicquerybuilder;

import java.util.ArrayList;
import java.util.List;

import com.hariram.dynamicquerybuilder.JoinFilterUtil.JOIN_TYPE;

public class JoinFilterDO {
	private String table1 = "";
	private String table2= "";
	private String columnName = "";
	private JOIN_TYPE joinType = JOIN_TYPE.INNER;
	private List<String> listColumn;
	public JoinFilterDO(){
		
	}
public JoinFilterDO(String table1,String table2,String columnName,JOIN_TYPE joinType,List<String> list){
	this.table1 =table1;
	this.table2 =table2;
	this.columnName =columnName;
	this.joinType=joinType;
	this.listColumn = new ArrayList<String>(list);
}
public String getFirstTable(){
	return table1;
}
public void setFirstTable(String table1){
	this.table1 =table1;
}
public String getSecondTable(){
	return table2;
}
public void setSecondTable(String table2){
	this.table2 = table2;
}
public String getColumnName(){
	return columnName;
}
public void setColumnName(String columnName){
	this.columnName=columnName;
}
public JOIN_TYPE getJoinType(){
	return joinType;
}
public void setJoinType(JOIN_TYPE joinType){
	this.joinType=joinType;
}
public List<String> getListColumn() {  
    return new ArrayList<String>(this.listColumn);  
}
public void setListColumn(List<String> list) {  
	this.listColumn = new ArrayList<String>(list); 
}
}
