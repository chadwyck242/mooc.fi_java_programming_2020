
/**
 *
 * @author chadsisk
 */

import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        
        if(gifts.isEmpty()){
            return -1;
        }
        
        int totalWeight = 0;
        
        for(Gift gift : gifts){
            totalWeight += gift.getWeight();
        }
        
        return totalWeight;
    }
}
