package com.example.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestJava {

	public static void main(String[] args) {
		Map<String, Object> m1 = new HashMap<>();
		m1.put("key11", "key1");
		m1.put("key12", "key2");
		Map<String, Object> m2 = new HashMap<>();
		m2.put("key21", "key1");
		m2.put("key22", "key2");
		Map<String, Object> m3 = new HashMap<>();
		m3.put("key31", "key1");
		m3.put("key32", "key2");
		System.out.println("======");
		List<Map<String, Object>> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		Map<String, Object> megerListMap = new HashMap<>();
//		//java 8 迭代list
//		list.forEach(x->{
//			x.forEach((y,z)->{
//				System.out.println(y+" : "+z);
//				megerListMap.put(y, z);
//			});
//		});
//		System.out.println("==============");
//		//java8迭代map
//		megerListMap.forEach((x,y)->{
//			System.out.println(x+" : "+y);
//		});
		Map<String, Object> meg = list.stream().map(Map::entrySet).flatMap(Set::stream).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		meg.forEach((x,y)->{
			System.out.println(x+" : "+y);
		});
	}

}
