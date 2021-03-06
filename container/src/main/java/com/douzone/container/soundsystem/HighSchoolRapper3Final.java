package com.douzone.container.soundsystem;

import org.springframework.stereotype.Component;

// @Component("HSRapper3Final")
// @Named("highSchoolRapper3Final")
@Component
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "지구멸망";
	private String artist = "양승호";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
