package bank;

import java.util.Scanner;

public class BankAplicationTest {

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
				if(acc.getNumber() == null) {
					System.out.println("계좌 생성후 조회해주세요");
				}else {
					System.out.println(acc.getName()+"님의 계좌번호는 "+acc.getNumber()+"이며 잔액은 "+acc.getMoney()+"원 입니다.");
				}
			}else if(selectNo == 3) {
				if(acc.getName() == null) {
					System.out.println("계좌 생성후 다시 시도해주세요.");
				}else {
					long i;
				System.out.print("입금할 금액을 입력해주세요. > ");
				int aa = scanner.nextInt();
				i = acc.getMoney() + aa;
				acc.setMoney(i);
				System.out.println(aa+"원 입금완료"+" 보유잔액 "+acc.getMoney());
				}
				
				
			}else if(selectNo == 4) {
				if(acc.getNumber() == null) {
					System.out.println("계좌 생성후 조회해주세요");
				}else {
					long i;
				System.out.print("출금할 금액 입력해주세요 > ");
				long aa =scanner.nextInt();
				if(aa > acc.getMoney()) {
					System.out.println("계좌에 잔액이 부족하여 출금 불가합니다.");
				}else {
					i= acc.getMoney() - aa;
					acc.setMoney(i);
					System.out.println(aa+" 출금완료 "+" 보유 잔액 "+acc.getMoney());
				}
				}
				
			}else if(selectNo == 5) {
				run = false;
			}else {
				System.out.println("1번부터 5번까지 눌러주세요");
			}
		}
		System.out.println("프로그램 종료됨.");
	}

}
