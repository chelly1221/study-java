
public class ArrayEx19 {
	public static void main(String[] args) {
		int[][]score= {   // �迭����
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		//���� ����
		int korTotal = 0, engTotal = 0, mathTotal=0 ;
		
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("====================");
		for(int i=0; i<score.length;i++) {  //0���� �ʱ�ȭ score �迭���̸�ŭ �ݺ�
			int sum=0; //���κ� ����
			float avg=0.0f; //���κ� ���
			
			korTotal += score[i][0];  //���������� �������پƾƾ�
			engTotal += score[i][1];   // ���������� �������پƾƾ�
			mathTotal += score[i][2];  // ���������� �������پƾƾ�
			System.out.printf("%3d", i+1);  //�ε���+1�� �� ��ȣ �ű�´���.  3���ΰ� �տ� ���ڸ� ������ѵ�
			
			for(int j=0; j<score[i].length;j++) {  //
			sum += score[i][j];  
			System.out.printf("%5d", score[i][j]); // 5�ڸ��� �迭�� ���
			}
			avg=sum/ (float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("====================");
		System.out.printf("����:%3d %4d %4d%n", korTotal,engTotal,mathTotal);
	}
}