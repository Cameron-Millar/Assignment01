package csci2020u.Assignment01;

//this is the factory class, which will create a new Dragon object when called.
public class DragonFactory {
    public Dragon getDragon(String species){
        //creates a new dragon object with different details depending on the input dragon name
        if (species == null){
            return null;
        }
        else if(species.equalsIgnoreCase("DRAKE")){  
            return new Drake();
        }
        else if(species.equalsIgnoreCase("AMPHITHERE")){  
            return new Amphithere();
        }
        else if(species.equalsIgnoreCase("Wyrm")){  
            return new Wyrm();
        }
        else if(species.equalsIgnoreCase("WYVERN")){  
            return new Wyvern();
        }
        return null;
    }
    

}
