package com.javaex.ex02;

public class Circle {
	private double radius;
	public Circle() {}
	public Circle(double radius) {
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
