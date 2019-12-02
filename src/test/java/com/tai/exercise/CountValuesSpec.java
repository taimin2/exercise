package com.tai.exercise;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.tai.exercise.CountValuesApp;

public class CountValuesSpec {

	@Test
	public void whenInputIsEmptyThen0() {
		CountValuesApp app = new CountValuesApp();
		Map<Character, Integer> map = app.getDistinctCountUsingLoop("");
		assertEquals(0, map.size());
		map = app.getDistinctCountUsingRecursion("");
		assertEquals(0, map.size());
	}
	
	@Test
	public void whenInputHas1ValueThen1() {
		CountValuesApp app = new CountValuesApp();
		Map<Character, Integer> map = app.getDistinctCountUsingLoop("a");
		assertEquals(1, map.size());
		map = app.getDistinctCountUsingLoop("aaaaa");
		assertEquals(5, map.get('a').intValue());
		map = app.getDistinctCountUsingRecursion("a");
		assertEquals(1, map.size());
		map = app.getDistinctCountUsingRecursion("aaaaa");
		assertEquals(5, map.get('a').intValue());
	}
	
	@Test
	public void whenInputHas5ValuesThen5() {
		CountValuesApp app = new CountValuesApp();
		Map<Character, Integer> map = app.getDistinctCountUsingLoop("abbbbdhhhp");
		assertEquals(5, map.size());
		assertEquals(1, map.get('a').intValue());
		assertEquals(4, map.get('b').intValue());
		assertEquals(1, map.get('d').intValue());
		assertEquals(3, map.get('h').intValue());
		assertEquals(1, map.get('p').intValue());
		map = app.getDistinctCountUsingRecursion("abbbbdhhhp");
		assertEquals(5, map.size());
		assertEquals(1, map.get('a').intValue());
		assertEquals(4, map.get('b').intValue());
		assertEquals(1, map.get('d').intValue());
		assertEquals(3, map.get('h').intValue());
		assertEquals(1, map.get('p').intValue());
	}
	
}
