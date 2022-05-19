package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		Computer computer = new Computer();
		Computer computer1 = new Computer("Apple, ", "MacBook Air, ", "MacOS, ", 800, 'A', true);
		Computer computer2 = new Computer("Hp, ", "Envey, ", 1400, false, 'B', "Windows, ");
	}
}