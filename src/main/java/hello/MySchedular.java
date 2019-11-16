package hello;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
//@Component
public class MySchedular {
	
	private static int counter=0;
	private static int counter1=0;
	
	@Scheduled(fixedDelay = 20000)
	public void scheduleFixedDelayTask() {
		System.out.println(++counter1+" ---- START DELAY - " + System.currentTimeMillis() / 1000);
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(counter1+" ---- ENDED DELAY - " + System.currentTimeMillis() / 1000);
	}
	
	
	@Scheduled(fixedRate = 20000)
	public void scheduleFixedDelayTask2() {
		System.out.println(++counter+" ---- START RATE - " + System.currentTimeMillis() / 1000);
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(counter+" ---- ENDED RATE - " + System.currentTimeMillis() / 1000);
	}

}
