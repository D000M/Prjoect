package stringsExercises;

public class ExerciseFive {

	/*
	 * 5. �� �� ������� ��������, ����� ������ �� ������ ����� ����. ����������
	 * �� ������� ���� �������� ����� ����, ���� ������� � �� �������� ���� ���
	 * ����� ��� �� ����� �� ASCII ��������� � �������� ������� 5 � � ��������
	 * �������������� �����.
	 */

	public static void main(String[] args) {
		String text = "Hello";
		String newString = "";
		char temp = 0;
		for (int i = 0; i < text.length(); i++) {
			temp = (char) (text.charAt(i) + 5);
			newString += temp;
		}

		System.out.println(newString);
	}

}
