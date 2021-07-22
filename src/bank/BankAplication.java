package bank;

import java.util.Scanner;

public class BankAplication {

	public static void main(String[] args) {
//		기능 종류
//		1.계좌생성하기 - 1개만 개설가능 , 중복여부 체크
//		2.계좌목록 보여주기 - 계좌주,번호,잔액 
//		3.예금 - 21억까지만 가능 , 잔액이 21억 넘으면 입금불가, 정수만 입금가능(1원이상)
//		4.출금 - 음수 출금 불가 , 가진 돈보다 출금액이 적어야함 
//		5.프로그램종료 
//		기타 : 종료 전까지는 계속 반복
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Account acc = new Account();
//		System.out.println(acc.toString());
		
		while(run) {
			System.out.println("=========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("==========================================");
			System.out.print("선택하세요 >");
			
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {
				if(acc.getNumber() ==null) {
					acc.setNumber("111000-000001");
					acc.setName("곽여송");
					acc.setMoney(0);
					System.out.println("계좌 생성완료 " + acc.getNumber());
				}else {
					System.out.println("이미 계좌가 존재합니다 "+acc.getNumber());
				}
			}else if(selectNo == 2) {
				
			}else if(selectNo == 3) {
				
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}else {
				System.out.println("1번부터 5번까지 눌러주세요");
			}
		}
		System.out.println("프로그램 종료됨.");
	}

}
