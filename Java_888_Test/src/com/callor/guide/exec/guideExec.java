package com.callor.guide.exec;

import com.callor.guide.Service.GuideService;
import com.callor.guide.Service.Impl.GuideServiceImplV1;

public class guideExec {
	
	public static void main(String[] args) {
		
		GuideService gService = new GuideServiceImplV1();
		gService.loadGuide();
		gService.printGuideList();
	}
}
