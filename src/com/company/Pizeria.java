package com.company;

/**
 * Class Pizzeria our second main class where we make different kinds of pizzas, insert them into an array and print out it to our console
 */

public class Pizeria {

    public static void menu(){
        Circle test1 = new Circle(20);
        Circle test2 = new Circle(15);
        Pizza pz1 = new Pizza("Маргарита","Сыр, Помидоры, Базелик", 140, test1.radius);
        Pizza pz2 = new Pizza("Пеперони","Сыр, Колбоса, Острый соус чили", 160, test2.radius);
        Pizza pz3 = new Pizza("Гавайская","Сыр, Ветчина, Ананасы", 180, test1.radius);
        Pizza[] b = {pz1,pz2,pz3};

        for (Pizza pizza : b) {
            System.out.println(pizza.name + "  " + pizza.comp + "  " + pizza.cost + " grn   " + pizza.diam);
        }

    }
}
