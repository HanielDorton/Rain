package com.haniel.rain.util;

import com.haniel.rain.graphics.Screen;

public class Debug {
	
	private Debug() {
		
	}
	
	public static void drawRect(Screen screen, int x, int y, int width, int height, boolean fixed){
		screen.drawRect(x, y, width, height, 0xff0000, fixed);
		
	}
	
	public static void drawRect(Screen screen, int x, int y, int width, int height, int color, boolean fixed){
		screen.drawRect(x, y, width, height, color, fixed);
		
	}

}
