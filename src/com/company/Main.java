package com.company;

public class Main {

    public static void main(final String[] args) {
		Box<Box<Box<Fruit>>> boxBox = new Box<>();
		Box<Box<Box<Box<Fruit>>>> boxboxBox = new Box<>();
	Box<Box<Fruit>> fruitBox = new Box<>();
	Box<Fruit> appleBox = new Box<>();
	Apple fruit = new Apple();

	appleBox.put(fruit);
	fruitBox.put(appleBox);
	boxBox.put(fruitBox);
	boxboxBox.put(boxBox);

	BoxUtil.printElementFromBoxes(boxboxBox);
	BoxUtil.printElementFromTwoBoxes(fruitBox);


    }
}
