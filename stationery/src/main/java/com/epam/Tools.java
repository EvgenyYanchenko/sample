package com.epam;

public class Tools extends Stationery {
	private String handyOrMechanic;

	@Override
	public String toString() {
		return "\n" + "�������� " + getName() + ". ������������ ��� ������ " + handyOrMechanic + ". ����: "
				+ getPrice();
	}

	public String getHandyOrMechanic() {
		return handyOrMechanic;
	}

	public void setHandyOrMechanic(String handyOrMechanic) {
		this.handyOrMechanic = handyOrMechanic;
	}

}
