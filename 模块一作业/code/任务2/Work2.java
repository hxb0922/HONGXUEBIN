package deam1;

/**
 * ģ��һ-����2
 * @author hongxuebin
 *
 */
public class Work2 {

	public static void main(String[] args) {
		System.out.println("1000���ڵ������У�");
		for(int i = 0; i <= 1000; i ++){
			getSum(i);
		}
    }
	
	/**
	 * �ж��Ƿ�Ϊ�����������ӡ
	 * @param i
	 */
	public static void getSum(int i) {
		 //����
        int sum = 0;
        //��ȡ�ӳ�����������������
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
            	sum += j;
            }
        }
        //��ӡ
        if(sum == i) {
        	System.out.print(sum+",");
        }
	}

}
