package heisei20aki;

import java.util.*;

public class PhoneBook {
	Map<String, Set<String>> book = new HashMap<String, Set<String>>();

	public void add(String name, String phoneNumber) {
		Set<String> numbers = book.get(name);
		if (numbers == null) {
			numbers = new HashSet<String>();
		}
		numbers.add(phoneNumber);
		book.put(name, numbers);
	}

	public Set<String> get(String name) {
		Set<String> numbers = book.get(name);
		Set<String> set = new HashSet<String>();
		if (numbers != null) {
			set.addAll(numbers);
		}
		return set;
	}

	public void remove(String name) {
		book.remove(name);
	}

	public void remove(String name, String phoneNumber) {
		Set<String> numbers = book.get(name);
	}

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.add("èºìcè~éi", "0236661234");
		pb.add("èºìcè~éi", "08055551234");
		for (String num : pb.get("èºìcè~éi")) {
			System.out.println(num);
		}
	}

}
