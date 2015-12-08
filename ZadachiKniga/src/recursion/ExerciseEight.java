package recursion;

public class ExerciseEight {

	/*
	 * 8. �� �� ������� ��������, ����� ��������� ���� �������� ���������� �����
	 * � ������. ������ � �����, ����� �� ���� ��� ������� ���������� �� 1 � ��
	 * ���� ��. ����������� ��������.
	 */

	public static void main(String[] args) {
		System.out.println("It is Prime? ---> " + itIsPrime(564, 2));
	}
	
	public static boolean itIsPrime(int n, int del) {
		if(n < 3) {
			return true;
		}
		
		if(n == del) {
			return true;
		}
		
		if(n % del == 0) {
			return false;
		}
		
		return itIsPrime(n, del + 1);
	}

}
