package hello2;
import java.util.Scanner;

public class Hello2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int st;
		int a;
//		int classa;
		
		/*�ȳ��ϼ���
		���� ���� �Դϴ�
		�ߺ�Ź�մϴ�*/
		
		// ���ڿ� ���� ����
		String b = "��ι�";
		String c = "���̸�ε�";
		a = 10;
		
		System.out.println("�ȳ��ϼ���");
		System.out.println("����"+b+"�Դϴ�");
		System.out.println("�� ��Ź�մϴ�");
		System.out.println(b+"�� ģ����"+c+"�Դϴ�");
		System.out.print(c+"�� ����");System.out.print(a);System.out.print("�� �Դϴ�");
		
		// ���ڿ� ���� ����
		int tr = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//�õ� Ƚ��
		System.out.print("�õ�Ƚ���� �Է��Ͻÿ�");
		tr = sc.nextInt();
		
		System.out.println(b+"����"+c+"�� �����"+tr+"�� �õ��Ͽ����ϴ�");
		System.out.println("---------------------------------------");
		
		System.out.println("1�� �õ��� "+1+"ȸ �������ϴ�");
		System.out.println("���������ϴ�");
		System.out.print("���� �õ� Ƚ����?");
		tr -= 1;
		System.out.println(tr);
		System.out.println();
				
		System.out.println("2�� �õ��� "+1+"ȸ �������ϴ�");
		System.out.println("���������ϴ�");
		System.out.print("���� �õ� Ƚ����?");
		tr -= 1;
		System.out.println(tr);
		System.out.println();
		
		int try_count = 10;
				
		for(int i = 0; i<try_count;i++) {
			System.out.println(i+"�� �õ���"+(i+1)+"ȸ �������ϴ�");
			// ���࿡ 10�� ��������
			if(i==9) {
				System.out.println("�׳�� �������ϴ�");}
			// ���࿡  10���� �ƴϸ�
			else {
				System.out.println("��ȸ��"+(try_count-(i+1)+"�� ���ҽ��ϴ�"));
			}
		}
	}

}
