package com.techtalentsouth.TransitApp.Model;

public class Duration {
    public String text;
    public int value;
	public Duration() {
		
	}
	public Duration(String text, int value) {
		super();
		this.text = text;
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Duration [text=" + text + ", value=" + value + "]";
	}
	
	
    
    
}
