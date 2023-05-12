package com.callor.guide.Service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.guide.Service.GuideService;
import com.callor.guide.data.DataIndex;
import com.callor.guide.model.GuideDto;

public class GuideServiceImplV1 implements GuideService {

	List<GuideDto> gList;

	public GuideServiceImplV1() {
		gList = new ArrayList<>();
	}

	@Override
	public void loadGuide() {
		String guideFile = "src/com/callor/guide/data/guide.txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(guideFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			GuideDto gDto = new GuideDto();
			gDto.setGuideId(guide[DataIndex.GUIDE.ID]);
			gDto.setGuideName(guide[DataIndex.GUIDE.NAME]);
			gDto.setGuideOrder(guide[DataIndex.GUIDE.ORDER]);
			gDto.setGuideInformation(guide[DataIndex.GUIDE.INFORMATION]);
			gList.add(gDto);
		}
		scan.close();
	}

	@Override
	public void printGuideList() {
		System.out.println("=".repeat(200));
		System.out.println("id\t종목명\t순서\t방법");
		System.out.println("-".repeat(200));
		for (GuideDto dto : gList) {
			System.out.printf("%s\t", dto.getGuideId());
			System.out.printf("%s\t", dto.getGuideName());
			System.out.printf("%s\t", dto.getGuideOrder());
			System.out.printf("%s\n", dto.getGuideInformation());
		}
		System.out.println("-".repeat(200));
	}
}
