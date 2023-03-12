import java.util.Random;

public class RandomSymbol {
	public static void main(String[] args) {
		// Создаем экземпляр класса Random для генерации случайных чисел
		Random random = new Random();

		// Генерируем случайный символ в диапазоне от 0 до 65535
		char symbol = (char) random.nextInt(65536);

		// Выводим символ и его код в консоль
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);
		System.out.println("Символ: " + symbol);

		System.out.println("Код символа: " + (int) symbol);
	}
}
