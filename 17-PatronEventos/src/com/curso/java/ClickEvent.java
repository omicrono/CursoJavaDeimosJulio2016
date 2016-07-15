package com.curso.java;

public class ClickEvent {

	private Clickable target;

	public ClickEvent(Clickable target) {
		super();
		this.target = target;
	}

	public Clickable getTarget() {
		return target;
	}

	public void setTarget(Clickable target) {
		this.target = target;
	}
}
