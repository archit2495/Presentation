/**
 * Created by archit.g on 7/18/2017.
 */
public class BurgerSculptor {
    public static void main(String[] args){

        MeatBurger meatBurger = new MeatBurger();
        meatBurger.makeBurger();
        System.out.println();
        VegBurger vegBurger = new VegBurger();
        vegBurger.makeBurger();
    }

}
