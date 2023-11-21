import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestDog {
    Dog dog = new Dog();
    @Test
    public void testMove(){
        String move;
        move = dog.move();
        assertEquals(move, "I am running!");
    }
    @Test
    public void testMakeSound(){
        String sound;
        sound = dog.makeSound();
        assertEquals(sound, "Bark");
    }
    @Test
    public void testMisbehave(){
        String str;
        str = dog.misbehave("homework");
        assertEquals(str, "homework");
    }
}
