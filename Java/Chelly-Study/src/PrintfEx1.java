
public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c ='A';
		
		int ���� = 10;
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; //8������ �տ� 0 ����
		int hexNum = 0x10; //16������ 0x���̰�
		int binNum = 0b10; //2������ 0b   ���� ��ȯ ¥����
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);
		System.out.printf("c=%c, %d %n",c,(int)c);
	    System.out.printf("����=[%5d]%n",����);
		/*System.out.printf("����=[%-5d]%n",����);
		System.out.printf("s=%d%n",����);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s);
		System.out.printf("s=%d%n",s); */
	}
}