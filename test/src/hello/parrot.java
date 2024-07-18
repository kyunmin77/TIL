package hello;

import java.util.Scanner;

public class parrot {
	
	
	public static void main(String[] agrs) {
		int choosedNum = 0;
		String answer = null;
		
		while(choosedNum == 0) {
			System.out.println("앵무새에게 말을 걸어 보세요.");
			Scanner parrot = new Scanner(System.in);
			String repeat = parrot.nextLine();
			System.out.println(repeat);
			System.out.println("계속하시려면 0 아니면 1 을 누르세요.");
			Scanner choice = new Scanner(System.in);
			choosedNum = choice.nextInt();
		}
		System.out.println("대화를 종료합니다.");
		System.out.println();
		
	}
	
}
