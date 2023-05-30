package com.callor.shop.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.IoListDto;
import com.callor.shop.models.ProductDto;
import com.callor.shop.service.impl.BuyerServiceImplV1;
import com.callor.shop.service.impl.IoListServiceImplV1;
import com.callor.shop.service.impl.ProductServiceImplV1;

public class ShoppingService {
	
	protected final Scanner scan;
	protected List<ProductDto> productList;
	protected List<BuyerDto> buyerList;
	protected List<IoListDto> ioList;
	protected final ProductService productService;
	protected final BuyerService buyerService;
	protected final IoListService ioListService;

	
	public ShoppingService() {
		productService = new ProductServiceImplV1();
		buyerService = new BuyerServiceImplV1();
		ioListService = new IoListServiceImplV1();
		scan = new Scanner(System.in);
	}
	
	public void printProductList() {
		productList = productService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("빛나라 쇼핑몰 상품리스트");
		System.out.println("=".repeat(100));
		System.out.printf("상품코드\t상품명\t품목\t매입단가\t매출단가\n");
		System.out.println("=".repeat(100));
		for(ProductDto productDto : productList) {
			System.out.printf("%s\t",productDto.pCode);
			System.out.printf("%s\t",productDto.pName);
			System.out.printf("%s\t",productDto.pItem);
			System.out.printf("%d\t\t",productDto.pIPrice);
			System.out.printf("%d\n",productDto.pOPrice);
		}
		System.out.println("=".repeat(100));
	}
	public void insertProduct() {
		System.out.println("=".repeat(100));
		System.out.println("상품정보 등록");
		System.out.println("=".repeat(100));
		System.out.printf("상품코드 >> ");
		String strPCode = scan.nextLine();
		ProductDto productDto = productService.findById(strPCode);
		if(productDto == null) {
			System.out.println("신규 상품 등록을 시작합니다");
			System.out.printf("상품명 >> ");
			String strPName = scan.nextLine();
			System.out.printf("품목 >> ");
			String strPItem = scan.nextLine();
			System.out.printf("매입단가 >> ");
			String strPIPrice = scan.nextLine();
			int pIPrice = 0;
			try {
				pIPrice = Integer.valueOf(strPIPrice);
				if(pIPrice < 0 ) {
					System.out.println("매입단가는 정수만 입력해주세요");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("매입단가는 정수만 입력해주세요");
			}
			System.out.printf("매출단가 >> ");
			int pOPrice = 0;
			double price = pIPrice + (pIPrice * 0.22);
			pOPrice = (int)(Math.round(price / 100.0) * 100);
			System.out.println(pOPrice);
			
			ProductDto productDto2 = new ProductDto();
			productDto2.pCode = strPCode;
			productDto2.pName = strPName;
			productDto2.pItem = strPItem;
			productDto2.pIPrice = pIPrice;
			productDto2.pOPrice = pOPrice;
			
			productService.insert(productDto2);

		} else {
			System.out.println("상품정보를 수정합니다");
			System.out.printf("상품 코드 : %s\n",productDto.pCode);
			System.out.printf("상품명(%s)",productDto.pName);
			String strPName = scan.nextLine();
			if(!strPName.equals("")) {
				productDto.pName = strPName;
			}
			System.out.printf("품목(%s)",productDto.pItem);
			String strPItem = scan.nextLine();
			if(!strPItem.equals("")) {
				productDto.pItem = strPItem;
			}
			System.out.printf("매입단가(%d)",productDto.pIPrice);
			String strPIPrice = scan.nextLine();
			int pIPrice = 0;
			try {
				pIPrice = Integer.valueOf(strPIPrice);
				if(pIPrice < 0 ) {
					System.out.println("매입단가는 정수만 입력해주세요");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("매입단가는 정수만 입력해주세요");
			}
			if(!strPIPrice.equals("")) {
				productDto.pIPrice = pIPrice;
			}
			System.out.printf("매출단가(%d)",productDto.pOPrice);
			int pOPrice = 0;
			double price = pIPrice + (pIPrice * 0.22);
			pOPrice = (int)(Math.round(price / 100.0) * 100);
			System.out.println(pOPrice);
			productDto.pOPrice = pOPrice;
			
			int result = productService.update(productDto);
			if( result > 0 ) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		}
	}
	public void printBuyerList() {
		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("빛나라 쇼핑몰 고객리스트");
		System.out.println("=".repeat(100));
		System.out.printf("고객ID\t고객이름\t전화번호\t주소\n");
		System.out.println("=".repeat(100));
		for(BuyerDto buyerDto : buyerList) {
			System.out.printf("%s\t",buyerDto.buId);
			System.out.printf("%s\t",buyerDto.buName);
			System.out.printf("%s\t",buyerDto.buTel);
			System.out.printf("%s\n",buyerDto.buAddr);
		}
		System.out.println("=".repeat(100));
	}
	public void insertBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("고객 등록 및 수정");
		System.out.println("=".repeat(100));
		System.out.print("고객ID >> ");
		String strId = scan.nextLine();
		int intId = Integer.valueOf(strId);
		String buId = String.format("%010d", intId);
		System.out.print("고객이름 >> ");
		String strBuName = scan.nextLine();
		System.out.print("전화번호 >> ");
		String strBuTel = scan.nextLine();
		System.out.print("주소 >> ");
		String strBuAddr = scan.nextLine();
		
		BuyerDto buyerDto = new BuyerDto();
		buyerDto.buId = buId;
		buyerDto.buName = strBuName;
		buyerDto.buTel = strBuTel;
		buyerDto.buAddr = strBuAddr;
		buyerService.insert(buyerDto);
	}
	public void printIoList() {
		ioListService.selectAll();
		buyerList = buyerService.selectAll();
		productList = productService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("전체거래 리스트를 출력합니다");
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t"
				+ "\t상품명\t판매단가\t수량\t판매합계\n");
		System.out.println("=".repeat(100));
		for(IoListDto ioListDto : ioList) {
			BuyerDto buyerDto = buyerService.findById(ioListDto.ioBuid);
			ProductDto productDto = productService.findById(ioListDto.ioPCode);
			System.out.printf("%s\t",ioListDto.ioDate);
			System.out.printf("%s\t",ioListDto.ioTime);
			System.out.printf("%s\t",buyerDto.buId);
			System.out.printf("%s\t",buyerDto.buName);
			System.out.printf("%s\t",buyerDto.buTel);
			System.out.printf("%s\t",productDto.pCode);
			System.out.printf("%s\t",productDto.pName);
			System.out.printf("%s\t",ioListDto.ioPrice);
			System.out.printf("%s\t",ioListDto.ioQuan);
			System.out.printf("%s\t",(ioListDto.ioPrice * ioListDto.ioQuan));
		}
		System.out.println("=".repeat(100));
	}
	
	public void insertIoList() {
		System.out.println("거래등록을 시작합니다");
		System.out.print("거래일자 >> ");
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(dateFormat.format(date));
		System.out.print("거래시각 >> ");;
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println(timeFormat.format(date));
		
		System.out.print("고객ID >> ");
		String buId = scan.nextLine();
		BuyerDto buyerDto = buyerService.findById(buId);
		if(buyerDto == null) {
			System.out.println("존재하지 않는 고객ID 입니다");
			return;
		}
		System.out.print("상품코드 >> ");
		String pCode = scan.nextLine();
		ProductDto productDto = productService.findById(pCode);
		if(productDto == null) {
			System.out.println("존재하지 않는 상품코드 입니다");
			return;
		}
		System.out.print("수량 >> ");
		String strQuan = scan.nextLine();
		int ioQuan = 0;
		try {
			ioQuan = Integer.valueOf(strQuan);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수량은 정수값만 입력해주세요");
		}
		System.out.print("판매단가 >> ");
		String strPrice = scan.nextLine();
		int ioPrice = 0;
		try {
			ioPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("판매단가는 정수값만 입력해주세요");
		}
		IoListDto ioListDto = new IoListDto();
		ioListDto.ioDate = dateFormat.format(date);
		ioListDto.ioTime = timeFormat.format(date);
		ioListDto.ioBuid = buId;
		ioListDto.ioPCode = pCode;
		ioListDto.ioQuan = ioQuan;
		ioListDto.ioPrice = ioPrice;
		ioListService.insert(ioListDto);
	}
	
	public void findByBuyer() {
		this.printBuyerList();
		System.out.println("고객ID를 입력해 주세요");
		System.out.printf("고객 ID >> ");
		String strBuId = scan.nextLine();
		BuyerDto buyerDto = buyerService.findById(strBuId);
		if(buyerDto == null) {
			System.out.println("고객ID 가 없습니다");
			return;
		} else {
			System.out.println("-".repeat(100));
			System.out.printf("고객ID : %s\n", buyerDto.buId);
			System.out.printf("이름 : %s\n", buyerDto.buName);
			System.out.printf("전화번호 : %s\n", buyerDto.buTel);
			System.out.printf("주소 : %s\n", buyerDto.buAddr);
			System.out.println("-".repeat(100));
		}
		List<IoListDto> ioList = ioListService.findByBuyer(strBuId);
		if(ioList.isEmpty()) {
			System.out.println("거래정보가 없습니다");
			return;
		} else {
			System.out.println("-".repeat(100));
			System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t"
					+ "상품명\t판매단가\t수량\t판매합계");
			System.out.println("-".repeat(100));
		}
		
	}

}
