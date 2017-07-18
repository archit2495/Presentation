/**
 * Created by archit.g on 7/18/2017.
 */
public class MeatBurger extends GenericBurger {
    @Override
    void addMeat() {
        System.out.println("Meat is added");
    }

    @Override
    void addCheese() {

    }
    boolean customerWantsMeat(){
        return true;
    }
    boolean customerWantsCheese(){
        return false;
    }
}
