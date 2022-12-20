package datastructure.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedHashMapTest {
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into" + "paranoid  situations";
		
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String,Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {

			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		Assertions.assertEquals(3, frequency);
	}
}
