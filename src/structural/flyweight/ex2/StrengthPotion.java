package structural.flyweight.ex2;

// Flyweight
public class StrengthPotion implements Potion{
    @Override
    public void drink() {
        System.out.println("You feel strength. (Potion=" + System.identityHashCode(this) + ")");
    }
}
