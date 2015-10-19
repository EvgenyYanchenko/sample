package com.epam;

public class Main {

	public static void main(String[] args) {

		Paper fpaper = new Paper();
		fpaper.setName("White");
		fpaper.setPrice(100);
		fpaper.setKol(12);

		Writeln writeln = new Writeln();
		writeln.setName("parker");
		writeln.setPrice(1000);
		writeln.setKol(5);

		Calendar calendar = new Calendar();
		calendar.setName("2016");
		calendar.setPrice(12);
		calendar.setKol(52);

		System.out.println(allCostPaper(fpaper.getPrice(), fpaper.getKol()));
		System.out.println(allCostCalendar(calendar.getPrice(), calendar.getKol()));
		System.out.println(allCostWriteln(writeln.getPrice(), writeln.getKol()));
	}

	private static int allCostWriteln(int price, int kol) {
		return price * kol;
	}

	private static int allCostPaper(int price, int kol) {
		return price * kol;
	}

	private static int allCostCalendar(int price, int kol) {
		return price * kol;
	}

}
