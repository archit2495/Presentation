/**
 * Created by archit.g on 7/18/2017.
 */
public class VegBurger extends GenericBurger {
    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
        System.out.println("Cheese is added");

    }
    boolean customerWantsMeat(){
        return false;
    }
    boolean customerWantsCheese(){
        return true;
    }
}
