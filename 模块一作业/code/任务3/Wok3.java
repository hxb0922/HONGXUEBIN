package deam1;

import java.util.Random;

/**
 * 模块一-任务3
 * @author hongxuebin
 *
 */
public class Wok3 {

	public static void main(String[] args) {
		//定义结果
		String result = "";
		//设置最初循环次数
		int size = 6;
		for(int i = 0; i < size; i++) {
			//生成红色球号码
			int red = getBlueBall(33);
			//如果本次号码已经生成过，则重新生成
			if(result.contains(String.valueOf(red))) {
				size ++;
			}else {
				result += (red + ",");
			}
		}
		//获取蓝色球号码
		int blue = getBlueBall(16);
		result += blue;
		System.out.println("中奖号码是："+result);
	}

	/**
	 * 生成随机号码（1-num）
	 * @return
	 */
	public static int getBlueBall(int num) {
		  int i  = 1 + ((int) (new Random().nextFloat() * num));
		  return i;
	}
	
}
