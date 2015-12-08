package recursion;

public class ExerciseSeven {

	/*
	 * 7. �� �� ������� ��������, ���� ����� �� �������� ������� � ������ �����,
	 * �� �������� �� ����� ��� ��� ������ �� �����, ��������� � ������� ����� �
	 * ����������� ���� �� � ���� �� ����� ���, ������ �� �� ������ �� ������� �
	 * ������ �����. ����������� ��������.
	 */

	public static String row(int n) {
		if (n == 1)
			return "1";

		else
//			System.out.println(n);
		return row(n - 1) + " " + n;
	}

	public static String triangle(int a, int b) {
//		System.out.println(a + " " + b);
		if (a == b)
			return row(b);

		else
//			System.out.println(row(a));
			return row(a) + "\n" + triangle(a + 1, b);

	}

	public static void main(String[] args) {
		 System.out.println(triangle(1, 3));
//		triangle(1, 3);
		// System.out.println(row(5));
//		row(5);
	}

}
