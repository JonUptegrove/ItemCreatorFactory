package ItemClasses;

import Interfaces.Item;

public class Shield implements Item {
    @Override
    public void use(){
        System.out.println("Shield is raised");
    }
}
