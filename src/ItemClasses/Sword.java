package ItemClasses;

import Interfaces.Item;

public class Sword implements Item {
    @Override
    public void use(){
        System.out.println("Sword is swung");
    }
}
