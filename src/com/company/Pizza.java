package com.company;

public class Pizza {
    Circle basis;
    String comp;
    String name;
    double cost;
    double diam;

    public Pizza(String name, String comp, double cost, double diam) {
        this.diam = diam;
        this.comp = comp;
        this.name = name;
        this.cost = cost;

        Circle piz1 = new Circle(diam / 2);
    }
}
