package com.shamshad.mathematics;

import java.awt.Robot;
import java.util.Date;
import java.util.Random;

public class MouseMover {
	public static final int FIVE_SECONDS = 15000;
	public static final int MAX_Y = 400;
	public static final int MAX_X = 400;

	public static void main(String... args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		long startTime = System.currentTimeMillis(); // fetch starting time
		long hour = 4;
		while (false || (System.currentTimeMillis() - startTime) < mathUnitConversions12(hour)) {
			robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
			Thread.sleep(FIVE_SECONDS);

			System.out.println(new Date());

		}
	}
	

	public static long mathUnitConversions12(long hours) throws Exception {
		
		
        //main("sss");
		return  hours * 60 * 60 * 1000;

	}
}