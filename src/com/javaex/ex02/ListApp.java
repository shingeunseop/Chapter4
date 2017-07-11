package com.javaex.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
	
	public static void main (String[] args) {
		/*ArrayList<Circle> list=new ArrayList();*/
		List<Circle> list=new LinkedList<Circle>();
		
		Circle c01=new Circle(5);
		Circle c02=new Circle(10);
		Circle c03=new Circle(15);
		
		list.add(c01);
		list.add(c02);
		list.add(c03);
		list.add(c01);
		list.remove(1);//1번 박스의 값을 삭제
		list.add(0,c02);//맨앞자리에 값을 넣고 싶을때
		System.out.println(list.toString());
		
		list.add(c01);
		list.add(c02);
		list.add(c03);
		
		/*Circle a=list.get(1);//1번쨰에 있는 값을 꺼냄, a에 값을 넣음
		System.out.println(a.toString());
		System.out.println(a.getRadius());*/
		
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getRadius());
		}
		for(Circle c: list) {//처음과 긑까지 다 훑을때 전체용{즉 가지고 있는 모든 수 연산가능
		
			System.out.println(c.getRadius());//전체가 주소들을 가지고 있음. 써클 하나의 반지름을 가져오기.
			
		}
		
		
		
	}


}
