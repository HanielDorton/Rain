package com.haniel.rain.entity.projectile;

import com.haniel.rain.graphics.Screen;
import com.haniel.rain.graphics.Sprite;

public class WizardProjectile extends Projectile{

	public WizardProjectile(int x, int y, int dir) {
		super(x, y, dir);
		range = 200;
		speed = 4;
		damage = 20;
		rateOfFire = 15;
		sprite = Sprite.projectile_wizard;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update() {
		move();
	}
	
	protected void move() {
		x += nx;
		y += ny;
	}
	
	public void render(Screen screen){
		screen.renderProjectile(x, y, this);
	}
}
