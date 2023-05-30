package com.callor.shop.exec;
import java.util.Scanner;

import com.callor.shop.service.ShoppingService;

public class ShoExecA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingService sService = new ShoppingService();
		while(true) {
			System.out.println("=".repeat(100));
			System.out.println("빛나라 쇼핑몰 2023");
			System.out.println("=".repeat(100));
			System.out.println("상품관리");
			System.out.println("-".repeat(40));
			System.out.printf("\t1. 상품리스트\n\t2. 상품등록 및 수정\n");
			System.out.println("-".repeat(40));
			System.out.println("고객관리");
			System.out.println("-".repeat(40));
			System.out.printf("\t3. 고객리스트\n\t4. 고객등록 및 수정\n");
			System.out.println("-".repeat(40));
			System.out.println("상품판매");
			System.out.println("-".repeat(40));
			System.out.printf("\t5. 장바구니 상품 담기\n\t6. 구매자별 장바구니 리스트 보기\n\t"
					+ "7. 장바구니 전체 리스트 보기\n");
			System.out.println("-".repeat(40));
			System.out.println("QUIT. 끝내기");
			System.out.println("=".repeat(100));
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if(strSelect.equals("QUIT")) {
				break;
			}
			int select = 0;
			try {
				select = Integer.valueOf(strSelect);
				if ( ! (select >= 1 && select <= 7) ) {
					System.out.println("업무 선택은 1 ~ 7 까지 중에 선택하세요");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.printf("업무 선택은 QUIT(끝내기), 1 ~ 7 정수만 입력할 수 있습니다( %s )\n", strSelect);
			}
			if( select == 1) sService.printProductList();
			if( select == 2 ) sService.insertProduct();
			if( select == 3) sService.printBuyerList();
			if( select == 4) sService.insertBuyer();
			if( select == 5) sService.insertIoList();
			if( select == 6) sService.findByBuyer();
			if( select == 7) sService.printIoList();
		}
	}
}
