package com.sweetshop;

import java.util.ArrayList;
import java.util.List;

public class SweetStore {

	private List<Sweet> sweetList = new ArrayList<>();

	public void add(Sweet sweet) {
		sweetList.add(sweet);
	}

	public List getList() {
		return sweetList;
	}

	public void removeSweet(Sweet sweet) {
		sweetList.remove(sweet);
	}

	public Sweet getSweet(String name) {
		for (Sweet sweet : sweetList) {
			if (sweet.name.equals(name)) {
				return sweet;
			}
		}

		return null;

	}

	public Sweet updateSweet(Sweet name) {
		for (Sweet sweet : sweetList) {
			if (sweet.name.equals(name)) {
				sweetList.set(sweetList.indexOf(name),name);
				System.out.println("Updated"); 
			}
		}
		return null;
	}
}