public class Dog implements Animal, Devilish{
    public String makeSound(){return "Bark";}
    public String move(){return "I'm running!";}
    public String misbehave(String str){return "I chewed up your " + str;}
}
