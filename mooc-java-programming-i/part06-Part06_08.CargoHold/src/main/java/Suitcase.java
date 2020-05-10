/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        
        for(Item item : items){
            System.out.println(item);
        }
    }
    
    public String listItems(){
        
        String listItems =  "";
        
        for(Item item : items){
            listItems += item.toString() + "\n";
        }
        
        return listItems;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviestObject = this.items.get(0);
        
        for(Item itm : items){
            if(heaviestObject.getWeight() < itm.getWeight()){
                heaviestObject = itm;
            }
        }
        return heaviestObject;
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }

        return sumOfWeights;
    }

    @Override
    public String toString() {
        
        String itemString = "";
        
        if(items.size() == 0){
            itemString = "no items" + " (" + this.totalWeight() + " kg)";
        }
        else if(items.size() == 1){
            itemString = this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            itemString = this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        
        return itemString;
    }
}
