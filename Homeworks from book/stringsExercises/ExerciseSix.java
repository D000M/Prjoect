package stringsExercises;

public class ExerciseSix {

	/*
	 * 6. �� �� ������� ��������, ����� ��� ������� ����� � ������� ������ ��
	 * ��������� ����� ���� �� ����� ������� � ������.
	 */

	public static void main(String[] args) {
		String text = "Az obicham Banica";
		text = text.toLowerCase();
		
		char letter = 'a';
		int count = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (letter == text.charAt(i)) {
				count++;
			}
			
		}
		
		System.out.println("The char " + letter + " is " + count + " times");

	}

}
