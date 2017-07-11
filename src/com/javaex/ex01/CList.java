package com.javaex.ex01;

import java.util.Arrays;

import com.javaex.ex02.Circle;

public class CList {
	private Circle[] cArray;
	private int crtPos;

	public CList() {
		this.cArray = new Circle[3];
		this.crtPos = 0;
	}

	public void add(Circle circle) {
		cArray[crtPos] = circle;
		crtPos++;
	}

	public void remove() {
		cArray[crtPos - 1] = null;
		crtPos--;
	}

	@Override
	public String toString() {
		return "CList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	

}
