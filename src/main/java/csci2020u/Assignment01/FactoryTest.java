package csci2020u.Assignment01;

// This is my main class, which i call the factory class from
public class FactoryTest {
    public static void main(String[] args){
        //test code
        DragonFactory factory = new DragonFactory();

        //create a dragon object for each type of dragon i've included
        Dragon dragon1 = factory.getDragon("Amphithere");
        Dragon dragon2 = factory.getDragon("Drake");
        Dragon dragon3 = factory.getDragon("Wyrm");
        Dragon dragon4 = factory.getDragon("Wyvern");

        //print each dragon's name, number of legs, and number of wings
        System.out.println(dragon1.toString());
        System.out.println(dragon2.toString());
        System.out.println(dragon3.toString());
        System.out.println(dragon4.toString());
    }
}
