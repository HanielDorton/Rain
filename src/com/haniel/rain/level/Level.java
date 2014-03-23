package com.haniel.rain.level;

import com.haniel.rain.graphics.Screen;
import com.haniel.rain.level.tile.Tile;

public class Level {
	
	protected Tile[] tiles;
	protected int width, height;
	protected int[] tilesint;
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesint = new int[width * height];
		generateLevel();
	}
	
	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}
	
	protected void generateLevel() {
	}
	
	protected void loadLevel(String path) {
	}
	
	public void update() {
		
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll  + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;
		
		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				//getTile(x, y).render(x, y, screen);
				if (x + y * 16 < 0 || x + y * 16 >= 256) {
					Tile.voidTile.render(x, y, screen);
					continue;
				}
				tiles[x + y * 16].render(x, y, screen);
				
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		if (tilesint[x + y * width] == 0) return Tile.grass;
		if (tilesint[x + y * width] == 1) return Tile.flower;
		if (tilesint[x + y * width] == 2) return Tile.rock;
		return Tile.voidTile;
	}
}
