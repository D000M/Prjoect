package sortingAlgorithms;

public class ExerciseTwo {

	/*
	 * �� �� ������������ ������� ������� � �������� �����. ����� ���������
	 * ��������� � ���������� �� ��������� �����, ���� ����� ���������
	 * ����������, ����� ������. �� �� ������ ���� � �������� �� �������� ���
	 * ��� � ������� ��� �� �� ������� � �������� ������.
	 */

	public static void main(String[] args) {
		int[][] array = {{3, 2, 5},
				         {1, 8, 4}};
	}
	
	public static void binarySearch(int num, int[] array, int row, int col) {
		int left = 0;
		int right = array.length;
		int rowCount = 0;
		
		while(rowCount < row) {
			while (left <= right) {
				int mid = (left + right) / 2;
				
				if(array[mid] == num) {
					System.out.println("The number " + num + " is founded in row " + rowCount + " and col " + mid );
					break;
				}
				
				if(array[mid] < num) {
					
				}
			}
		}
	}

}
