package com.curso.java;

public enum Color {
	Rojo("FF0000", ""), Verde("00FF00", ""), Azul("0000FF", "");
	
	private String rgb;
	private String hsl; 
	
	private Color(String rgb, String hsl) {
		this.rgb = rgb;
		this.hsl = hsl;
	}

	public String getRgb() {
		return rgb;
	}

	public String getHsl() {
		return hsl;
	}

}
