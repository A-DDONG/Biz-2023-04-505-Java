package com.callor.memo.exec;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class DBExecB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
		MemoDao memoDao = sqlSession.getMapper(MemoDao.class);
		MemoDto memoDto = new MemoDto();

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

		System.out.print("1. 메모 작성, 2. 메모 수정, 3. 메모 조회, 9. 메모 삭제 >> ");
		String select = scan.nextLine();
		if (select.equals("1")) {
			System.out.print("작성자를 입력해주세요 >> ");
			String writer = scan.nextLine();
			System.out.print("작성일자 >> ");
			System.out.println(dateFormat.format(date));
			System.out.print("제목을 입력해주세요 >> ");
			String subject = scan.nextLine();
			System.out.print("내용을 입력해주세요 >> ");
			String content = scan.nextLine();

			memoDto.m_writer = writer;
			memoDto.m_date = dateFormat.format(date);
			memoDto.m_subject = subject;
			memoDto.m_content = content;

			int result = memoDao.insert(memoDto);
			if (result > 0) {
				System.out.println("데이터 추가 성공");
			} else {
				System.out.println("데이터 추가 실패");
			}

		} else if (select.equals("2")) {
			System.out.println("수정할 메모의 번호를 입력해주세요");
			System.out.print("번호 >> ");
			String num = scan.nextLine();
			MemoDto memoDto2 = memoDao.findById(num);
			if(memoDto2 == null) {
				System.out.println("존재하지 않는 번호입니다");
				return;
			} 
			
			System.out.print("작성자를 입력해주세요 >> ");
			String writer = scan.nextLine();
			memoDto2.m_writer = writer;
			
			System.out.print("수정일자 >> ");
			System.out.println(dateFormat.format(date));
			memoDto2.m_date = dateFormat.format(date);
			
			System.out.print("제목을 입력해주세요 >> ");
			String subject = scan.nextLine();
			memoDto2.m_subject = subject;
			
			System.out.print("내용을 입력해주세요 >> ");
			String content = scan.nextLine();
			memoDto2.m_content = content;


			int result = memoDao.update(memoDto2);
			if(result > 0) {
				System.out.println("메모 수정 성공");
			} else {
				System.out.println("메모 수정 실패");
			}

		} else if (select.equals("9")) {
			System.out.println("삭제할 메모의 번호를 입력해주세요");
			System.out.print("번호 >> ");
			String num = scan.nextLine();
			memoDao.delete(num);
			System.out.printf("%s 번 글이 삭제되었습니다\n", num);
//			List<MemoDto> memoList = memoDao.selectAll();
//			System.out.println(memoList.toString());

		} else if (select.equals("3")) {
			System.out.println("현재까지 작성된 메모를 조회합니다");
			List<MemoDto> memoList = memoDao.selectAll();
			System.out.println(memoList);
		}

	}
}
