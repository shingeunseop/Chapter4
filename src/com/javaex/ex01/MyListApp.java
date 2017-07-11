package com.javaex.ex01;

import com.javaex.ex02.Circle;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList cList=new MyList();
		Circle c01= new Circle(5);
		Circle c02= new Circle(10);
		Circle c03= new Circle(15);
		
		cList.add(c01);
		System.out.println(cList.toString());
		cList.add(c02);
		System.out.println(cList.toString());
		
		/*MyList sList=new MyList();
		Studnet s01=new Studnet("정우성","서울");
		Studnet s02=new Studnet("이정제","경기");
		Studnet s03=new Studnet("이효리","세주");
		sList.add(s01);
		System.out.println(sList.toString());
		sList.add(s02);
		System.out.println(sList.toString());
		sList.add(c01);
		System.out.println(sList.toString());*/
		

	}

}
