package com.haniel.rain.entity;

import java.util.Random;

import com.haniel.rain.graphics.Screen;
import com.haniel.rain.graphics.Sprite;
import com.haniel.rain.level.Level;

public class Entity {
	
	public int x, y;
	private Sprite sprite;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public Entity() {
		
	}
	
	public Entity(int x, int y, Sprite sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
		if (sprite != null) screen.renderSprite(x, y, sprite, true);
	}
	
	public void remove() {
		//Remove from level
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
	
	public void init(Level level) {
		this.level = level;
	}



}
