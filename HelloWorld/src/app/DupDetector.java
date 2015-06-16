package app;

import java.util.HashMap;
import java.util.Map;

public class DupDetector {

	static int[] array = { 1, 2, 3, 4, 5, 6, 2 };

	public static int findDuplicateValue() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer element : array) {
			if (!map.containsKey(element)) {
				map.put(element, 1);
			} else {
				int oldValue = map.get(element);
				map.put(element, oldValue+1);
			}
		}
		
		for (int key : map.keySet()) {
			int value = map.get(key);
			if(value > 1) return key;
		}
		return -1;
	}
}