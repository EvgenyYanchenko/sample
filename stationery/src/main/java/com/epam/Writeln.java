package com.epam;

public class Writeln extends Stationery {

	@Override
	public String toString() {
		return "�������� " + getName() + ". ���� �������: " + color + ". ����: " + getPrice();
	}

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
