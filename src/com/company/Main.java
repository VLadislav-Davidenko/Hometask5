package com.company;
import com.company.Circle;
import com.company.Pizeria;

/**
 * Main Class for creating Objects Circle
 */

public class Main {

    public static void main(String[] args) {

        Circle krug1 = new Circle(12.3);
        Circle krug2 = new Circle(4.8, "Dark Blue");

        Circle.answer(krug1);
        Circle.answer(krug2);

        Pizeria.menu();
        Pizza piza = new Pizza("Маргарита","Сыр, Помидоры, Базелик", 140, 40);
        

    }
}
