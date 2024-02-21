package classes;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public ZooKeeper() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal, String food){
        System.out.println("feed "+ animal.getName());
        animal.eat(food);
    }
}
