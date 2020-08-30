package deam1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 模块一作业-任务一
 * @author hongxuebin
 *
 */
public class Work1 {

	public static void main(String[] args) {
		//打印提示
		System.out.println("请输入年月日（格式为yyyy-mm-dd）：");
		//获取键盘输入
		Scanner sc = new Scanner(System.in);
        // 判断是否还有输入
        if (sc.hasNext()) {
            String data = sc.next();
            //转换日期类型
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //定义日期
            Date da = null;
			try {
				//日期转换
				da = sdf.parse(data);
			} catch (ParseException e) {
				//转换报错时捕获打印，并终止方法
				System.out.println("请输入正确的日期格式！");
				return;
			}
			//打印天数，%tj为天数（网上提供的方式）
            String strDate =String.format("这一天是这一年的第%tj天!",da); 
            System.out.println(strDate);
        }
        //关闭
        sc.close();
	}

}
