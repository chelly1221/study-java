
public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] score= {
				{100, 100, 100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};
		int sum = 0;
		
		for(int i=0;i < score[i].length; i++) {  // 1���迭���̸�ŭ �����ݺ�,
			for(int j=0; j <score[i].length;j++) {  // 2���迭���̸�ŭ �����ݺ� 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);  // �ε����� ��Ÿ����
			}	
		}
		for (int[] tmp: score) {  //�迭�� ������ �ƴ� �������� ����Ǳ� ������ ���� �ƿ츣�� �ּڰ��� ����Ʈ�� ����Ȱ� TMP�� �ҷ��ͼ�
			for(int i : tmp) {   //i�� �ҷ��� tmp �ε������� �־ ������  
				sum+=i;     // ��� ���� ����
			}
		}
		System.out.println("sum="+sum);
	}
}