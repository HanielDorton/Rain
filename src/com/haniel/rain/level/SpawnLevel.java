package com.haniel.rain.level;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.haniel.rain.entity.mob.Chaser;
import com.haniel.rain.entity.mob.Dummy;
import com.haniel.rain.entity.mob.Shooter;
import com.haniel.rain.entity.mob.Star;

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
		//add(new Chaser(20, 60));
		
		//add(new Star(21, 33));
		//for (int i = 0; i < 5; i++) {
		//add(new Dummy(20, 55));
		add(new Shooter(20, 55));
	}
		
	

	protected void generateLevel() {
	}

}
