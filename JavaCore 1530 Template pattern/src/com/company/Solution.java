package com.company;

/*

1530. Level 15 Lection 12. Template pattern
1. In a separate file, create a DrinkMaker class with three abstract methods:
- void getRightCup () - select a suitable cup
- void putIngredient () - put the ingredients
- void pour () - fill with liquid
2. In the DrinkMaker class, create and implement the void makeDrink () method, which prepares the drink in the following sequence: selects a cup, puts the ingredients, fills with liquid.
3. In separate files, create LatteMaker and TeaMaker classes, which are inherited from DrinkMaker.
4. Distribute the following phrases between all methods in the LatteMaker and TeaMaker classes, various phrases for different methods.
5. Each method should output its phrase to the console without intersecting with other methods.
6. Phrases:
"Pour boiling water"
“We take a cup for latte”
"Pour tea"
“Take a cup for tea”
“Pour milk with froth”
"Making coffee"

Requirements:
1. The DrinkMaker class must be created in a separate file and be abstract.
2. The DrinkMaker class must contain declarations of the three abstract methods getRightCup, putIngredient, and pour.
3. In the DrinkMaker class, the makeDrink method must be implemented that will call the abstract methods of this class in the sequence specified by the condition.
4. The LatteMaker class must be created in a separate file and be a descendant of the DrinkMaker class.
5. The TeaMaker class must be created in a separate file and be a descendant of the DrinkMaker class.
6. The getRightCup method in the LatteMaker class should display the phrase “Take a cup for latte”.
7. The putIngredient method in the LatteMaker class should display the phrase "Make coffee."
8. The pour method in the LatteMaker class should display the phrase "Pour milk with froth."
9. The getRightCup method in the TeaMaker class should display the phrase "Take a cup for tea."
10. The putIngredient method in the TeaMaker class should display the phrase "Pour tea."
11. The pour method in the TeaMaker class should display the phrase "Pour boiling water."


 */

public class Solution {
    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        tea.makeDrink();
        latte.makeDrink();
    }
}

class TeaMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для чая");

    }

    @Override
    public void putIngredient() {
        System.out.println("Насыпаем чай");

    }

    @Override
    public void pour() {
        System.out.println("Заливаем кипятком");

    }
}
abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

class LatteMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для латте");

    }

    @Override
    public void putIngredient() {
        System.out.println("Делаем кофе");

    }

    @Override
    public void pour() {
        System.out.println("Заливаем молоком с пенкой");

    }
}




