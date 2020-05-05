/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String initialIdentifier, String initialName){
        this.identifier = initialIdentifier;
        this.name = initialName;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedItem = (Archive) compared;
        
        return this.identifier.equals(comparedItem.identifier);
    }
}
