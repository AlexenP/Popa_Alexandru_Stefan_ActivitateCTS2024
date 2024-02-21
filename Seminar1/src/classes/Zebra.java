package classes;

public class Zebra extends Animal{

    public Zebra(String name, Integer age){
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("i am "+ getName()+ "zebra and I want to eat "+food);
    }
}
