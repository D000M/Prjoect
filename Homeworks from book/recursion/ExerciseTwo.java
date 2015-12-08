package recursion;

public class ExerciseTwo {

	/*
	 * 2. �� �� ������� ��������, ����� �� ������� ����� � ���������� �����
	 * ������� ���������� ������� �� ������. ����������� ��������.
	 */

	public static void main(String[] args) {
		int[] array = {-18, -15, 3, 10, 78, 13, -27, 8, -5, 11, 25, 37};
		
		
		System.out.println(min(array, 0));

	}

	public static int min(int[] elements, int index) {

		  if (index == elements.length - 1) {
		    return elements[index];
		  }

		  int val = min(elements, index + 1);

		  if (elements[index] < val) {
		    return elements[index];
		  }
		  else {
		    return val;
		  }
		}
}
