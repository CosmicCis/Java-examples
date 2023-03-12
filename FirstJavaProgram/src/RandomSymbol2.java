
import java.util.Random;

	public class RandomSymbol2 {
		/*
		Название программы: разговор с богартом (богом, вселенной и вообще...)
		 */
		private static final Random random = new Random();
		private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";

		public static String generateRandomWord(int length) {
			StringBuilder sb = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				int randomIndex = random.nextInt(CHARACTERS.length());
				sb.append(CHARACTERS.charAt(randomIndex));
			}
			return sb.toString();
		}
		public static void main(String[] args) {
			new RandomSymbol2();
			//abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
			System.out.println("Random word: " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18) + " " + generateRandomWord(18));
		}
	}

