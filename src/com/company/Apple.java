package com.company;

final  class Apple extends Fruit {
    @Override
    public String toString() {
        return "Яблоко{" + "fresh = " + getFresh() + '}';
    }
}
