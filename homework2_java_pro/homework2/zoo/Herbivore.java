package de.telran.baibak.iryna.homework2.zoo;

public class Herbivore extends Animal{


    @Override
    public void eat(String food) {
        super.eat(food);

        if(food == "meat") {
            System.out.printf("Я такое не ем %n");
        }
    }

    @Override
    public void voice() {
        super.voice();
    }

}
