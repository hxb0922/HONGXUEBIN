package demo.service;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		demo1();
	}
	private static void demo1() {
		 int[][] arr = new int[16][16];
		 int index = 15;
		 int sumLeft = 0;
		 int rightSum = 0;
		 for(int i = 0; i < arr.length; i++) {
			 int hang = 0;
			 for(int j = 0; j < arr[i].length; j++) {
					int x = (int)(Math.random()*100);
					arr[i][j] = x;
					hang += x;
					if(i == j) {
						sumLeft += x;
					}
			 }
			 System.out.println("��"+(i+1)+"�еĺ�:"+hang);
			 rightSum += arr[i][index];
			 index--;
		 }
		 System.out.println("���ϵ������еĺ�:"+sumLeft);
		 System.out.println("���ϵ������еĺ�:"+rightSum);
		 System.out.println("arr:"+Arrays.deepToString(arr));
	}
	
}
