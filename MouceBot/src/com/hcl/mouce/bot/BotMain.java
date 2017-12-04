package com.hcl.mouce.bot;

import java.awt.AWTException;
import java.awt.Robot;

public class BotMain {

	public static void main(String[] args) {
		while (true) {
			try {
				Robot mouceBot = new Robot();

				Thread.sleep(5000);

				mouceBot.mouseMove(1000, 500);
				Thread.sleep(1000);
				mouceBot.mouseMove(1000, 1000);
				 Thread.sleep(2000);
				mouceBot.mouseMove(0, 1000);
				Thread.sleep(1000);
				mouceBot.mouseMove(0, 500);

			} catch (AWTException | InterruptedException  e) {

				e.printStackTrace();
			}

		}
	}
}
