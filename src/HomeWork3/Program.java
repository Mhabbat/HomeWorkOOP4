package HomeWork3;

public class Program {
    public static void main(String[] args) {


        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFrukti(apple);
        boxApple.addFrukti(apple);
        boxApple.addFrukti(apple);
        boxApple.addFrukti(apple);
        boxOrange.addFrukti(orange);
        boxOrange.addFrukti(orange);


        System.out.println("Вес коробки с яблоками = " + boxApple.getWeight());
        System.out.println("Вес коробки с апельсинами = " + boxOrange.getWeight());

        if (boxApple.compare(boxOrange) == true) {
            System.out.println("Вес коробок с фруктами равен.");
        } else {
            System.out.println("Вес коробок с фруктами НЕ равен.");
        }

        boxApple.compare(boxOrange);

        Box<Apple> boxApple1 = new Box<Apple>();
        boxApple1.addFrukti(apple);
        System.out.println("Вес до пересыпания из коробки в коробку:");
        System.out.println("Вес первой коробки = " + boxApple.getWeight());
        System.out.println("Вес второй = " + boxApple1.getWeight());

        boxApple.transfer(boxApple1);
        System.out.println("Вес после пересыпания из коробки в коробку:");
        System.out.println("Вес первой коробки с яблоками = " + boxApple.getWeight());
        System.out.println("Вес второй коробки с яблоками = " + boxApple1.getWeight());



    }

}

