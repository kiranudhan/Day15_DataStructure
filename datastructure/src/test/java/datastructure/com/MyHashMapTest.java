package datastructure.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String,Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		Assertions.assertEquals(2, frequency);
	}
}
