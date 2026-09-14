import Interfaces.Item;
import Interfaces.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator itemCreator = new ConcreteItemCreator();

        Item Sword = itemCreator.createItem("sword");
        Sword.use();
        Item Shield = itemCreator.createItem("shield");
        Shield.use();
        Item Potion = itemCreator.createItem("potion");
        Potion.use();
        Item Error = itemCreator.createItem("bow");
        Error.use();


    }
}