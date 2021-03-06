import java.util.*;

public class MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];   //배열 생성헤헤
		byte[][] shipBoard = {  //배열지정배열배열
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 },
		};
				for(int i=1;i<SIZE;i++)  //
					board[0][i] = board[i][0] = (char)(i+'0');    //+48해서 i를 char로 바꿔도 시각적으로 같은 수가 나오게하려고.
				
				Scanner scanner = new Scanner(System.in);
				
				while(true) {
					System.out.printf("좌표를 입력하세요. (종료는 00)>");
					String input = scanner.nextLine();
					
					if(input.length()==2) {   //입력받은 길이가 2글자면
						x = input.charAt(0) - '0';  //문자를 숫자로 변환  charAt(0)하면 맨 앞자리가져오는거  input이 1이면 1-'0'
						y = input.charAt(1) - '0';
						
						if(x==0 && y==0)
							break;
 					}
					
					if(input.length()!=2 ||x<=0||x>=SIZE ||y<=0||y>=SIZE) {   //입력받은길이가 2글자가 아니면
						System.out.println("잘못된 입력입니다. 다시입력해주세요.");
						continue;
					}
					board[x][y] = shipBoard[x-1][y-1]==1 ? '0' : 'X';   // 맞으면 0 틀리면 X 저장
					
					for(int i=0; i<SIZE; i++)
						System.out.println(board[i]);  //
					System.out.println();   //한줄 띄우자
		}
	}
}