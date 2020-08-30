package deam1;

/**
 * 模块一-任务5
 * @author hongxuebin
 *
 */
public class Work5 {

	public static void main(String[] args) {
		//打印第一行
		for(int i = 0; i < 17; i++) {
			if(i == 0) {
				System.out.print("  ");
			}else {
				System.out.printf("%x ",i - 1);//按16进制输出
			}
		}
		for(int j = 0; j < 17; j ++) {
			if(j != 0) {
				//打印第一列
				System.out.printf("%x ",j - 1);//按16进制输出
				//打印棋盘
				for(int k = 0; k < 16; k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}
