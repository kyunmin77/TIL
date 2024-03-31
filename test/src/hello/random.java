package hello;

import java.util.Scanner;

public class random {
	static int num = 1;
	
	public static void main(String[] agrs) {
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*99)+1); //개별값 수 만큼 곱하고 +-로 범위설정
		}	
			// 입찰
		while(num !=99 && num !=0) {
			
			System.out.println("입찰 하시겠습니까?\n Pass   Need");
			Scanner choice = new Scanner(System.in);
			String answer = choice.nextLine();
			
			switch(answer){
				case "Pass":
				case "pass":
					num = 0;
					System.out.println(num);
					break;
				case "Need":
				case "need":
					num = (int)(Math.random()*99)+1;
					System.out.println(num);
					break;
					
			}
			
		}
		if (num == 99)
			System.out.println("획득하였습니다.");		
		else if (num == 0)
			System.out.println("입찰을 포기하였습니다.");
	}
}
