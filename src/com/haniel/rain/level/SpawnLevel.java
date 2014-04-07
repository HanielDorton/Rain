package com.haniel.rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.haniel.rain.entity.mob.Chaser;
import com.haniel.rain.entity.mob.Dummy;

public class SpawnLevel extends Level{
	
	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception! Could not load level file");		
		}
		for (int i = 0; i < 1; i++) {
			add(new Chaser(20, 60));
		}
		for (int i = 0; i < 5; i++) {
			add(new Dummy(20, 55));
		}
		
	}
	

	protected void generateLevel() {
	}

}
