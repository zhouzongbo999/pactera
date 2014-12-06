package com.tony.model;


import java.awt.Color;

public class Line {
	private Point start;
	private Point end;
	private Color color;
	public Line(){
		this.color=Color.black;
	}
	public Line(Color color) {
		super();
		this.color = color;
	}
	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
		this.color=Color.black;
	}
	public Line(Point start, Point end, Color color) {
		super();
		this.start = start;
		this.end = end;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Point getStart() {
		return start;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
}
