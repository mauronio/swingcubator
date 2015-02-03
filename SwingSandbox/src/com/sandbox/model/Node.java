package com.sandbox.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

	List<Node> children = new ArrayList<Node>();
	String name = null;
	String desc = null;

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getType();

	public abstract boolean supportsChildType(int childType);
	
	Node getChild(int index) {
		return children.get(index);
	};

	Node getChild(String name) {
		
		Node child = null;
		
		for (int k=0; k<children.size(); k++) {
			if (children.get(k).getName().equals(name)) {
				child = children.get(k);
				break;
			}
		}
		return child;
	};
	
	void insertChild(Node child, int position) {
		if (position<children.size()) {
			children.add(position, child);
		}
	}

	void addChild(Node child) {
		children.add(child);
	}

	void replaceChild(Node child, int position) {
		if (position<children.size()) {
			children.set(position, child);
		}
	}
	
	void removeChild(int position) {
		if (position<children.size()) {
			children.remove(position);
		}
	}
	
	int getChildrenSize() {
		return children.size();
	}
}
