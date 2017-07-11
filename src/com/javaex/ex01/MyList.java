package com.javaex.ex01;

import java.util.Arrays;

public class MyList<T> {//object이용한 모든 파일형에서 사용가능한 형태

	/*public static void main(String[] args) {*/
		
		private T[] oArry;
		private int crtPos;
		
		public MyList() {
			this.oArry = (T[])new Object[3];
			this.crtPos=0;
		}
		public void add(T object) {
			oArry[crtPos]=object;
			crtPos++;
		}
		public void remove() {
			oArry[crtPos-1]=null;
			crtPos--;
		}
		@Override
		public String toString() {
			return "MyList [oArry=" + Arrays.toString(oArry) + ", crtPos=" + crtPos + "]";
		}
		
		/*SList sList=new SList();
		Studnet s01=new Studnet("정우성","서울");
		Studnet s02=new Studnet("이정제","경기");
		Studnet s03=new Studnet("이효리","세주");
		
		sList.add(s01);
		System.out.println(sList.toString());


		CList cList= new CList();
		Circle c01= new Circle(5);
		Circle c02= new Circle(10);
		Circle c03= new Circle(15);
		
		cList.add(c01);
		System.out.println(cList.toString());
		cList.add(c02);
		System.out.println(cList.toString());
		cList.remove();
		System.out.println(cList.toString());*/

	
	
	
}
