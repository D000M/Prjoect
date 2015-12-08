package recursion;

public class ExerciseOne {

	/*
	 * 1. �� �� ������� ��������, ����� ������ �� ������ ����� ���������� �����
	 * N � ������� �� ������ ���������� �� N! (N ���������). ��������� �� �����
	 * N �� ��������� ���� ��������� �� ������ ����� �� 1 �� N. �����������
	 * ��������.
	 */

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static long factorial(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}
