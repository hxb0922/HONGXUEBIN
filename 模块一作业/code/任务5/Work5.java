package deam1;

/**
 * ģ��һ-����5
 * @author hongxuebin
 *
 */
public class Work5 {

	public static void main(String[] args) {
		//��ӡ��һ��
		for(int i = 0; i < 17; i++) {
			if(i == 0) {
				System.out.print("  ");
			}else {
				System.out.printf("%x ",i - 1);//��16�������
			}
		}
		for(int j = 0; j < 17; j ++) {
			if(j != 0) {
				//��ӡ��һ��
				System.out.printf("%x ",j - 1);//��16�������
				//��ӡ����
				for(int k = 0; k < 16; k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
