package heisei20haru;

public class ElectricPot {

	public static final String IDLE = "休止";
	public static final String HEATING = "加熱中";
	private String currentState;
	private int content;

	public ElectricPot(int c) {
		this.content = c;
	}

	public void setContent(int c) {
		this.content = c;
	}

	public boolean isEmpty() {
		return (content == 0);
	}

	public void heat() {
		if (isEmpty()) {
			System.out.println("水がありません。");
		} else {
			currentState = HEATING;
			System.out.println("沸騰しています。");
		}
	}

	public void boiled() {
		if (currentState == HEATING) {
			currentState = IDLE;
			System.out.println("沸騰が終わりました。");
		}
	}

	public static void main(String[] args) {
		ElectricPot pot = new ElectricPot(10);
		pot.heat();
		pot.boiled();
		pot.setContent(0);
		pot.heat();
		pot.boiled();
	}

}
