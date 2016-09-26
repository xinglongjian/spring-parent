package org.jdk.eight.test.compile;

import java.util.ArrayList;
import java.util.List;

public class TestGenericCompile {

	public void testList(List<Object> list){
		System.out.println(list.size());
		list.add(1);
	}
	
	public void testWildcard1(List<? super Integer> list){
		list.add(1);
	}
	public void testWildcard2(List list){
	}
	
	public static void main(String[] args) {
        TestGenericCompile gen=new TestGenericCompile();
        List<String> list=new ArrayList<>();
        gen.testWildcard2(list);
        
       
	}

}
