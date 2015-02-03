package com.sandbox.model.project;

import com.sandbox.model.Node;

public class File extends Node {

	@Override
	public int getType() {
		return Project.typeFile;
	}

	@Override
	public boolean supportsChildType(int childType) {
		return false;
	}

}
