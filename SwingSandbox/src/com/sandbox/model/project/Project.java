package com.sandbox.model.project;

import com.sandbox.model.Node;

public class Project extends Node {

	public static final int typeProject = 0;
	public static final int typeFile = 1;
	public static final int typeFolder = 2;
	
	private String path;

	@Override
	public int getType() {
		return Project.typeProject;
	}

	@Override
	public boolean supportsChildType(int childType) {
		boolean isSupported = false;
		
		switch (childType) { 
			case Project.typeFolder: isSupported = true;
			case Project.typeFile: isSupported = true;
		}
		return isSupported;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
