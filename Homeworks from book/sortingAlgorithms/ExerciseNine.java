package sortingAlgorithms;

import java.util.Scanner;

public class ExerciseNine {

	/*
	 * ����� arr �������� ���� (��������� ������), ��� �� 0 <= i <=
	 * arr.length-1,������ �������� � ������� �� 0 �� i �� ��������� ����������
	 * (��������� ����������) � ������ �������� � ������� �� i �� arr.length-1
	 * �� ��������� ���������� (��������� ����������). �������� i ��������
	 * ���������. �������� ����� int findExtremum(int[] arr), ����� �����
	 * ���������� �� ������ arr, ����� � ��� ���� ��� ������. �� ��- ������
	 * ���������, �� ������ � � �������� ��������. �� �� �������� �������
	 * �������.
	 */

	public static void main(String[] args) {

//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 2};
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(findExtremum(array));
		
		
	}
	

	public static int findExtremum(int[] arr) {
        int extremum = 0;
        int index = 0;
        boolean isIncrase = false;
        if(arr[index] <= arr[index + 1]) {
            isIncrase = true;
        }
        while(index < arr.length) {
            
            if(isIncrase) {
                if(arr[index] <= arr[index + 1]) {
                    extremum = arr[index + 1];
                }
                else {
                    break;
                }
            }
            else {
                if(arr[index] >= arr[index + 1]) {
                    extremum = arr[index + 1];
                }
                else {
                    break;
                }
            }
            index++;
        }
        return extremum;
    }

}
