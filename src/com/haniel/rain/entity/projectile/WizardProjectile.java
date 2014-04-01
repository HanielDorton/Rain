package com.haniel.rain.entity.projectile;

import com.haniel.rain.entity.particle.Particle;
import com.haniel.rain.graphics.Screen;
import com.haniel.rain.graphics.Sprite;

public class WizardProjectile extends Projectile{

	public static final int FIRE_RATE = 8; //Higher is slower
	
	public WizardProjectile(int x, int y, double dir) {
		super(x, y, dir);
		range = random.nextInt(50) + 100;
		speed = 3;
		damage = 20;
		sprite = Sprite.projectile_wizard;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update() {
		if (level.tileCollision(x, y, nx, ny, 7)) {
			Particle p = new Particle((int) x, (int) y, 50, 500);
			level.add(p);
			
			remove();
		}
		move();
	}
	
	protected void move() {
		x += nx;
		y += ny;
		if (distance() > range) remove();
	}
	
	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
		return dist;
	}
	
	public void render(Screen screen){
		screen.renderProjectile((int)x - 12, (int)y - 2, this);
	}
}
