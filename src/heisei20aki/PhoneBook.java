package heisei20aki;

public class PhoneBook {

	String[][] book = new String[5][2];

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

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();

		pb.set(1, "山形太郎", "0236661234");
		pb.set(3, "天童よしみ", "08011112345");
		pb.display();
		
		System.out.println("-------------------------");

		pb.remove(1);
		pb.display();
	}

}
