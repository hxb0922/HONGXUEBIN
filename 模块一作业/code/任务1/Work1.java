package deam1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ģ��һ��ҵ-����һ
 * @author hongxuebin
 *
 */
public class Work1 {

	public static void main(String[] args) {
		//��ӡ��ʾ
		System.out.println("�����������գ���ʽΪyyyy-mm-dd����");
		//��ȡ��������
		Scanner sc = new Scanner(System.in);
        // �ж��Ƿ�������
        if (sc.hasNext()) {
            String data = sc.next();
            //ת����������
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //��������
            Date da = null;
			try {
				//����ת��
				da = sdf.parse(data);
			} catch (ParseException e) {
				//ת������ʱ�����ӡ������ֹ����
				System.out.println("��������ȷ�����ڸ�ʽ��");
				return;
			}
			//��ӡ������%tjΪ�����������ṩ�ķ�ʽ��
            String strDate =String.format("��һ������һ��ĵ�%tj��!",da); 
            System.out.println(strDate);
        }
        //�ر�
        sc.close();
	}

}
