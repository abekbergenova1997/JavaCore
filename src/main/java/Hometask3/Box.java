package Hometask3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Box<T extends Fruit>  {
    private ArrayList<T> container;

    public Box(ArrayList<T> container) {
        this.container = container;
    }

    public float getWeight(){
        if(container.size() == 0){
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }
    public boolean Compare(Box<? extends Fruit> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }
    public void changeBox(Box<T> box){
        box.container.addAll(this.container);
        this.container.clear();
    }
    public void addFruit(T fruit){
        this.container.add(fruit);
    }

    public final void addFruit(T... fruits){
        this.container.addAll(Arrays.asList(fruits));
    }

}
