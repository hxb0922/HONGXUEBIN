package deam1;

import java.util.Scanner;

/**
 * ģ��һ-����4
 * @author hongxuebin
 *
 */
public class Work4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[5];
		 int i = 0;
		 for(;;){
			 System.out.print("��������Ҫ�����������0�������룩��");
			 int s = sc.nextInt();
			 if(s == 0){
				 System.out.println("�ѽ������룡");
				 break; 
			}
			if(i >= arr.length * 0.8) {
				System.out.println("��ʹ��80%��ϵͳ��������");
				arr = marketExpansion(arr);
				System.out.println("ϵͳ������ɣ���ǰ��СΪ:"+arr.length);
			}
			arr[i] = s;
			i ++;
			System.out.println("��ǰʹ�ô�СΪ��"+i+",�ܴ�СΪ��"+arr.length);
			String result = "[";
			for(int j = 0; j < arr.length; j++) {
				result += arr[j]+",";
			}
			result = result.substring(0, result.length()-1);
			result += "]";
			System.out.println("ϵͳ����Ϊ:"+result);
		 }       
		 sc.close();
	}

	/**
	 * ��������
	 * @param arr
	 * @return
	 */
	public static int[] marketExpansion(int[] arr) {
		int[] newArr = new int[ (int) Math.round(arr.length * 1.5)];
		//��arr�����0λ����arr.lengthλ�ã����Ƶ�newArr����0λ�õ�arr.lengthλ�á�
        System.arraycopy(arr,0,newArr,0,arr.length);
        return newArr;
	}
}
