import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TestBird {
    Bird bird = new Bird();
    @Test
    public void testMove(){
        String move;
        move = bird.move();
        assertEquals(move, "I am flying!");
    }

    @Test
    public void testMakeSound(){
        String sound;
        sound = bird.makeSound();
        assertEquals(sound, "Chirp");
    }
}
