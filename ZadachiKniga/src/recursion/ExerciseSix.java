package recursion;



public class ExerciseSix {

	/*
	 * 6. �� �� ������� ��������, ����� ������ �� ������ ����� ���������� �����
	 * N. ���������� �� ������� �����, ����� ����� �� �������� � ���, ������� ��
	 * ���������� �����. ����������� ��������.
	 */

	public static void main(String[] args) {
		int n = 12345;
		reversNumber(n);
		

	}
	
	public static int reversNumber(int n) {
		if(n == 0) {
			return 1;
		}
	
		int temp = (n % 10);
		
		System.out.print(temp);

		n = reversNumber(n / 10);

		return temp;	
	}

}
