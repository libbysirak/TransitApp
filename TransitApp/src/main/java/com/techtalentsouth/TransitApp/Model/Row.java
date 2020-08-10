package com.techtalentsouth.TransitApp.Model;

import java.util.List;

public class Row {
    public List<Element> elements;

	public Row() {
		
	}

	public Row(List<Element> elements) {
		
		this.elements = elements;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "Row [elements=" + elements + "]";
	}
	
	
    
    
}
