import java.util.Scanner;

public class ExerciseTrueOrFalse {

	/*
	 * �� �� ������� ��������, ����� �� �������� ���� ����� ��������� ������ ���
	 * ����(true ��� false) � ���������� �� ���� ���� ������� �� ���� �� 2.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();

		System.out.println(divisionByTwo(num));
		
	}

	public static boolean divisionByTwo(int num) {
		boolean flag = false;
		
		if(num % 2 == 0) {
			flag = true;
		}
		
		return flag;
	}

}
