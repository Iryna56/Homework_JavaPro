package de.telran.baibak.iryna.homework1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone PhoneOne = new Phone();
        PhoneOne.model = "samsung";
        PhoneOne.weight = 10;
        PhoneOne.setNumber("12345");
        System.out.println(PhoneOne.model);
        System.out.println(PhoneOne.weight);
        System.out.println(PhoneOne.getNumber());
        System.out.println();
        Phone PhoneTwo = new Phone();
        PhoneTwo.model = "apple";
        PhoneTwo.weight = 14;
        PhoneTwo.setNumber("54321");
        System.out.println(PhoneTwo.model);
        System.out.println(PhoneTwo.weight);
        System.out.println(PhoneTwo.getNumber());
        System.out.println();

        Phone PhoneThree = new Phone();
        PhoneThree.model = "redmi";
        PhoneThree.setWeight(12);
        PhoneThree.setNumber("11111");
        PhoneThree.nameIn = "Tom";
        PhoneThree.nameOut = "Sara";
        System.out.println(PhoneThree.model);
        System.out.println(PhoneThree.getWeight());
        System.out.println(PhoneThree.getNumber());

        System.out.println("-----------------");

        PhoneOne.receiveCall("Ben");
        PhoneTwo.receiveCall("Mark");
        PhoneThree.receiveCall("Tom");
        System.out.println("------------------");
        PhoneOne.call("Lucia");
        PhoneTwo.call("Katya");
        PhoneThree.call("Sara");
    }
}
