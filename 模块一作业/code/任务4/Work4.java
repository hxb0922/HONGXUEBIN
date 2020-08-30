package deam1;

import java.util.Scanner;

/**
 * 模块一-任务4
 * @author hongxuebin
 *
 */
public class Work4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[5];
		 int i = 0;
		 for(;;){
			 System.out.print("请输入需要加入的整数（0结束输入）：");
			 int s = sc.nextInt();
			 if(s == 0){
				 System.out.println("已结束输入！");
				 break; 
			}
			if(i >= arr.length * 0.8) {
				System.out.println("已使用80%，系统正在扩容");
				arr = marketExpansion(arr);
				System.out.println("系统扩容完成，当前大小为:"+arr.length);
			}
			arr[i] = s;
			i ++;
			System.out.println("当前使用大小为："+i+",总大小为："+arr.length);
			String result = "[";
			for(int j = 0; j < arr.length; j++) {
				result += arr[j]+",";
			}
			result = result.substring(0, result.length()-1);
			result += "]";
			System.out.println("系统数据为:"+result);
		 }       
		 sc.close();
	}

	/**
	 * 数组扩容
	 * @param arr
	 * @return
	 */
	public static int[] marketExpansion(int[] arr) {
		int[] newArr = new int[ (int) Math.round(arr.length * 1.5)];
		//将arr数组从0位置至arr.length位置，复制到newArr数组0位置到arr.length位置。
        System.arraycopy(arr,0,newArr,0,arr.length);
        return newArr;
	}
}
