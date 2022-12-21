package animal_Cat;

/* Задание 5: Создать класс Animal с именем String, возрастом int, хвостом Boolean.
 В классе переопределить метод toString, что бы вывод был сдедующим:
 «Имя: Васька, возраст: 45, хвост: нет».
 В классе Animal переопределить методы equals & hashCode.
 */

import java.util.Objects;

class Animal{
    private String name;
    private int age;
    private Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;

    }
    public Animal() { }

        @Override
    public String toString() {
        return "Имя: " + this.name + ", возраст: " + this.age +
                ", хвост: " + (this.tail ? "да" : "нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Cat {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Васька", 45, true);
        Animal cat2 = new Animal("Васька", 45, false);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println("____________________________________");
        System.out.println("Should true - cat2.equals(cat1): " + cat2.equals(cat1));
        System.out.println("Should true - cat2.hashCode()==cat1.hashCode(): " + (cat2.hashCode()==cat1.hashCode()));
    }
}