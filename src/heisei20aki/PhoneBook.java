package heisei20aki;

public class PhoneBook {

	private String[][] book = new String[5][2];

	public void set(int recordNumber, String name, String phoneNumber) {
		String[] record = book[recordNumber - 1];
		record[0] = name;
		record[1] = phoneNumber;
	}

	public void remove(int recordNumber) {
		String[] record = book[recordNumber - 1];
		record[0] = null;
		record[1] = null;
	}

	public void display() {
		for (String[] record : book) {
			String name = record[0];
			String phoneNumber = record[1];
			if (name != null && phoneNumber != null) {
				System.out.printf("%s %s\n", record[0], record[1]);
			}
		}
	}

}
