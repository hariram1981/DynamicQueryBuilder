package com.hariram.dynamicquerybuilder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hariram.dynamicquerybuilder.JoinFilterUtil.JOIN_TYPE;

public class FilterDOTest {

	//@Test
	public void testSingle() {
		FilterDO filterDO = new FilterDO("ID", "5", ">");
		List<FilterDO> filterList = new ArrayList<FilterDO>();
		filterList.add(filterDO);
		String str = FilterUtil.getConditions(filterList);
		System.out.println(str);
		assertTrue(true);
	}
	
	//@Test
	public void testMultiple() {
		FilterDO filterDO = new FilterDO("ID", "5", ">");
		List<FilterDO> filterList = new ArrayList<FilterDO>();
		filterList.add(filterDO);

		filterDO = new FilterDO("NAME", "A", "=");
		filterList.add(filterDO);
		
		filterDO = new FilterDO("USER", "B", "<");
		filterList.add(filterDO);
		
		filterDO = new FilterDO("TYPE", "ACTIVE", "=");
		filterList.add(filterDO);

		
		String str = FilterUtil.getConditions(filterList);
		System.out.println(str);
		assertTrue(true);
	}
	@Test
	public void testJoin(){
	/*SELECT Companies.CompanyName, emp.Name
		FROM Companies
		INNER JOIN emp
		ON Companies.City=emp.City
		ORDER BY Companies.CompanyName;
	*/
		List<String> columnsList = new ArrayList<String>();
		columnsList.add("Companies.CompanyName");
		columnsList.add("emp.Name");
		//columnsList.add("*");
		JOIN_TYPE joinType = JOIN_TYPE.INNER;
	    String table1="Companies";
	    String table2="emp";
	    String equateColumn="City";
		JoinFilterDO joinfilterDO = new JoinFilterDO(table1, table2,equateColumn,joinType,columnsList);
		List<JoinFilterDO> joinfilterList = new ArrayList<JoinFilterDO>();
		joinfilterList.add(joinfilterDO);
		String str = JoinFilterUtil.getConditions(joinfilterList);
		String newString = new String(str.toString().replaceAll("[\\[\\](){}]",""));
		System.out.println(newString);
		assertTrue(true);	
	}
}