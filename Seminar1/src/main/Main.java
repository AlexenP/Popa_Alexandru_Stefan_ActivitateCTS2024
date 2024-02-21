package main;

import classes.*;

import java.util.HashMap;


public class Main {
    public enum FeedType{
        OMNIVORE,
        HERBIVORE,
        CARNIVORE;

        FeedType(){
            
        }
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Andi");
        ZOO zoo = new ZOO("National Zoo", zooKeeper, new HashMap<>());

        Lion leu1 = new Lion("Mrr", 3);
        Zebra zebra1 = new Zebra("Marty",2);
        zoo.addAnimal(leu1,"Meat");
        zoo.addAnimal(zebra1,"grass");
        zoo.addAnimal(new Cat("Missi",5), "mice");
        zoo.feedAllAnimals();

        FeedType feedType = FeedType.CARNIVORE;
    }
}