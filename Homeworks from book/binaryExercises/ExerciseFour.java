package binaryExercises;

import java.util.Scanner;

public class ExerciseFour {

	/*
	 * �� �� ������� ��������, ����� ������� 5 ���� ����� �� ���������. ������ �
	 * �� ��� ������ �� ��� �� �����, � ���� ����� � �������� �� ����������. ��
	 * �� ������ ���������� �� ���� �����. �� �� ��������� �������� ��������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		
		for (int i = 0; i < 11; i++) {
			System.out.print("Enter enter number: ");
			num = num ^ input.nextInt();
			System.out.println(num);
		}
		
		
		
		


	}

}
