package com.testP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindStrignOccurence {
	public static void main(String args[]) {
		String s = "Hemanth Kumar";
		String s1 = s.replaceAll(" ", "");
		HashMap<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;

			}
		}

	}

}
