package com.tai.exercise;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class CountValuesApp {
	
	
	public Map<Character, Integer> getDistinctCountUsingLoop(String str) {
		Map<Character, Integer> map = new TreeMap<>();
		
		for (char c : str.toCharArray()) {
			map.putIfAbsent(c, 0);
			map.put(c, map.get(c) + 1);
		}
		
		return map;
	}
	

	public Map<Character, Integer> getDistinctCountUsingRecursion(String str) {
		Map<Character, Integer> map = new TreeMap<>();
		char[] c = str.toCharArray();
		
		if (c.length == 0) {
			// return empty map
		} else if (c[0] == c[str.length() - 1] || c.length == 1) {
			map.put(c[0], c.length);
		} else {
			int mid = str.length() / 2;
			map.putAll(getDistinctCountUsingRecursion(str.substring(0, mid)));
			Map<Character, Integer> map2 = getDistinctCountUsingRecursion(str.substring(mid));
			
			for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
				Character key2 = entry.getKey();
				Integer value2 = entry.getValue();
				Integer value1 = map.get(key2);
				
				if (value1 == null) {
					map.put(key2, value2);
				} else {
					map.put(key2, value1 + value2);
				}
			}
		}
	
		return map;
	}
	
	
	private String generateRandomData(int length) {
		StringBuilder sb = new StringBuilder();
		
		new Random()
			.ints(length, 0, 26)
			.sorted()
			.forEach(v -> sb.append((char) (97 + v)));
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		CountValuesApp app = new CountValuesApp();
		int[] dataLengths = new int[] {10, 100, 1000, 10000, 100000, 1000000};
		DecimalFormat df = new DecimalFormat("#,###");
		
		for (int length : dataLengths) {
			String data = app.generateRandomData(length);
			long t1 = System.nanoTime();
			Map<Character, Integer> map = app.getDistinctCountUsingLoop(data);
			long t2 = System.nanoTime();
			Map<Character, Integer> map2 = app.getDistinctCountUsingRecursion(data);
			long t3 = System.nanoTime();
			
			if (data.length() <= 100) {
				System.out.println("input data    : " + data);
			} else {
				System.out.println("input data    : " + data.substring(0, 100) + "...");
			}
			
			System.out.println("output        : " + map);
			System.out.println("data length   : " + df.format(length));
			System.out.println("iteration took: " + df.format((t2-t1)) + " nsecs");
			System.out.println("recursion took: " + df.format((t3-t2)) + " nsecs\n");
		}
	}
	
}
