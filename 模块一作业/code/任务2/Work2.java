package deam1;

/**
 * 模块一-任务2
 * @author hongxuebin
 *
 */
public class Work2 {

	public static void main(String[] args) {
		System.out.println("1000以内的完数有：");
		for(int i = 0; i <= 1000; i ++){
			getSum(i);
		}
    }
	
	/**
	 * 判断是否为完数，是则打印
	 * @param i
	 */
	public static void getSum(int i) {
		 //完数
        int sum = 0;
        //获取从除本身以外所有因数
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
            	sum += j;
            }
        }
        //打印
        if(sum == i) {
        	System.out.print(sum+",");
        }
	}

}
