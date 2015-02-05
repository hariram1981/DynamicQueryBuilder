package com.hariram.dynamicquerybuilder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FilterDOTest {

	@Test
	public void testSingle() {
		FilterDO filterDO = new FilterDO("ID", "5", ">");
		List<FilterDO> filterList = new ArrayList<FilterDO>();
		filterList.add(filterDO);
		String str = FilterUtil.getConditions(filterList);
		System.out.println(str);
		assertTrue(true);
	}
	
	@Test
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

}
