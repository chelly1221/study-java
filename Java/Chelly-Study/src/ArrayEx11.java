
public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];  // �迭���̰� 10 (��ϼ��ڴ� 0~9)�� �迭 ����
		int[] counter = new int[10];  // �굵 ��������  (int �迭�� �⺻���� 0�̴�)
		
		for (int i=0; i < numArr.length; i++) {   // �迭 ���̸�ŭ �ݺ� (10ȸ)
			numArr[i] = (int)(Math.random() * 10);   // �ݺ��ϸ鼭 0~9 �� �ϳ��� �迭�� �������� ����.
			System.out.print(numArr[i]);   // �׸��� �װ� ���ι������� �ٿ��� �����
		}
		System.out.println();  // �̰� �׳� ��ĭ����� �ִ� �����ε�?
		
		for (int i=0; i < numArr.length; i++) {  // �迭���̸�ŭ �ݺ�
			counter[numArr[i]]++;            // numArr�迭 �ε���i�� ���� ī������ �ε�����ȣ�� �ǰ� �� �ε����� �迭���� 1���ϴ°� �ݺ�
		}
		for (int i=0; i<numArr.length; i++) { 
			System.out.println(i+"�� ���� :"+ counter[i]);  // 0���� 9���� ī�����ε��������� �־ ��� 
		}
 	}
}