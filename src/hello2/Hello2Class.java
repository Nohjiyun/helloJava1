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

		/*
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
		} */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// ��� �� �ִ� Ȯ������ ��� Ƚ��
		//1�� �ĺ��� 2��
		//2�� �ĺ��� 3��
		//3�� �ĺ��� 1��
		//4�� �ĺ��� 5��
		//5�� �ĺ��� 10��
		
		// �õ� Ƚ��
		int tr;
		System.out.println();
		System.out.println("================================");
		System.out.print("�õ�Ƚ���� �Է����ּ���(0�̻��� ��): ");
		tr = sc.nextInt();
		
		int [] odds = {2,3,1,5,10};
		
		int man_num = 0;
		
		while(true) {
			for(int i=1;i<=odds[man_num];i++) {
				System.out.println(man_num+1+"�� �ĺ���"+i+"ȸ ����� �õ��ߴ�");
				//if ��� Ȯ���� ���� �� ����ϸ�
				if(i==odds[man_num]) {
					System.out.println("��� Ż��");
					tr = tr-1;
				}else {
					System.out.println("�ַ��Դϴ�");
				}
			}
			man_num++; //���� �ַ�~
			System.out.print("���� Ƚ����?");
			System.out.println(tr);
			
			if(tr==0) break;
		}
		System.out.println("��鼺��");
	}

}
