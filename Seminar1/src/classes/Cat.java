package classes;

public class Cat extends Animal{
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("miau I am "+getName()+ " and I eat "+ food);
    }
}
