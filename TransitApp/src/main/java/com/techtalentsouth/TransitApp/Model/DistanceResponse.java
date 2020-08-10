package com.techtalentsouth.TransitApp.Model;

import java.util.List;

public class DistanceResponse {
    public List<Row> rows;

	public DistanceResponse() {
		
	}

	public DistanceResponse(List<Row> rows) {
	
		this.rows = rows;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "DistanceResponse [rows=" + rows + "]";
	}
	
	
    
	
	
    
}