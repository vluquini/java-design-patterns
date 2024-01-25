package structural.flyweight.ex2;

// Flyweight
public class PoisonPotion implements Potion{
    @Override
    public void drink() {
        System.out.println("You have poisoned attacks. (Potion=" + System.identityHashCode(this) + ")");
    }
}
