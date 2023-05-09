package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class ExecE {
	
	public static void main(String[] args) {
		
		AnimalDto anDto = new AnimalDto("럭키","허스키","5세");
		List<AnimalDto> animalList = new ArrayList<>();
		animalList.add(anDto);
		
		anDto = new AnimalDto("나비","버밀라","3세");
		animalList.add(anDto);
		anDto = new AnimalDto("몽","스피츠","7세");
		animalList.add(anDto);
		
		System.out.println(animalList.toString());
		
	}

}
