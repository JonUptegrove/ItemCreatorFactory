package ItemClasses;

import Interfaces.Item;

public class Error implements Item {
    @Override
    public void use(){
        System.out.println("Enter a valid item");
    }
}
