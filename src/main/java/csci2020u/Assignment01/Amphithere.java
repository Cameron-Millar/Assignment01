package csci2020u.Assignment01;

public class Amphithere implements Dragon {
    //subclass which will have an object made from it by the factory
    String name = "Amphithere";
    int legs = 0;
    int wings = 2;

    public String getName(){ // returns the name of the dragon's type
        return name;
    }
    public int getLegs(){ // returns how many legs the type of dragon has
        return legs;
    }
    public int getWings(){ // returns how many wings the dragon has 
        return wings;
    }
    public String toString(){ // returns all data as a string
        return ("The "+name+" has "+legs+" legs and "+wings+" wings.");
    }
}
