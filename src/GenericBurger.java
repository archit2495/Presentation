import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by archit.g on 7/18/2017.
 */
public abstract class GenericBurger {
    final void makeBurger(){
        cutTheBun();
        if(customerWantsMeat()){
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        wrapIt();

    }
    void cutTheBun(){
        System.out.println("The bun is cut");
    }
    boolean customerWantsMeat(){
        return false;
    }
    boolean customerWantsCheese(){
        return false;
    }
    abstract void addMeat();
    abstract void addCheese();
    void wrapIt(){
        System.out.println("The burger is ready!!");
    }
}

