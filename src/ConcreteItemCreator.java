import Interfaces.Item;
import Interfaces.ItemCreator;
import ItemClasses.Error;
import ItemClasses.Potion;
import ItemClasses.Shield;
import ItemClasses.Sword;

public class ConcreteItemCreator implements ItemCreator {
    @Override
    public Item createItem(String ItemType){
        Item item;

        if(ItemType.equals("sword")){
            item = new Sword();
        }
        else if(ItemType.equals("shield")){
            item = new Shield();
        }
        else if(ItemType.equals("potion")){
            item = new Potion();
        }
        else{
            item = new Error();
        }

        return item;
    }
}
