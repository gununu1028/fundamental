package heisei20aki;

public class PhoneBookTester {
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
