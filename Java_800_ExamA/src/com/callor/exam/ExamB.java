package com.callor.exam;

import com.callor.exams.service.GuideService;
import com.callor.exams.service.impl.GuideServiceImplV1;

public class ExamB {
	
	public static void main(String[] args) {
		GuideService guService = new GuideServiceImplV1();
		guService.loadGuide();
		guService.printGuide();
	}

}
