package ItemClasses;

import Interfaces.Item;

public class Potion implements Item {
    @Override
    public void use(){
        System.out.println("Heal potion is used");
    }
}
