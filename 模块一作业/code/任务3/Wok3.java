package deam1;

import java.util.Random;

/**
 * ģ��һ-����3
 * @author hongxuebin
 *
 */
public class Wok3 {

	public static void main(String[] args) {
		//������
		String result = "";
		//�������ѭ������
		int size = 6;
		for(int i = 0; i < size; i++) {
			//���ɺ�ɫ�����
			int red = getBlueBall(33);
			//������κ����Ѿ����ɹ�������������
			if(result.contains(String.valueOf(red))) {
				size ++;
			}else {
				result += (red + ",");
			}
		}
		//��ȡ��ɫ�����
		int blue = getBlueBall(16);
		result += blue;
		System.out.println("�н������ǣ�"+result);
	}

	/**
	 * ����������루1-num��
	 * @return
	 */
	public static int getBlueBall(int num) {
		  int i  = 1 + ((int) (new Random().nextFloat() * num));
		  return i;
	}
	
}
