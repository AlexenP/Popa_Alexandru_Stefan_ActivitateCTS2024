package classes;

public class Lion extends Animal{

    public Lion(String name, Integer age){
        super(name, age);
    }
    @Override
    public void eat(String food) {
        System.out.println("i am "+ getName()+ "lion and I want to eat "+food);

    }
}
