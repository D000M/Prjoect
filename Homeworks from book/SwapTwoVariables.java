
public class SwapTwoVariables {

	/*
	 * 7. �� �� ���������� ������� ������, ���� �� �� ������� ����������� �� ���
	 * �������� ���������� � � �, �� ��� �� �� �������� ����� ����������, � ����
	 * ����������� ��������.
	 */

	public static void main(String[] args) {
		
		int a = 8;
		int b = 5;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);

	}

}
