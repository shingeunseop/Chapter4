package com.javaex.ex01;

import java.util.Arrays;

public class SList {
	private Studnet[] sArry;
	private int crtPos;
	
	public SList() {
		this.sArry=new Studnet[3];
		this.crtPos=0;
	}
	public void add(Studnet studnet) {
		sArry[crtPos]=studnet;
		crtPos++;
	}
	public void remive() {
		sArry[crtPos-1]=null;
		crtPos--;
	}
	@Override
	public String toString() {
		return "SList [sArry=" + Arrays.toString(sArry) + ", crtPos=" + crtPos + "]";
	}
	

}
