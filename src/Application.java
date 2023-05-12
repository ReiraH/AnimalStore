
public class Application {

	public static void main(String[] args) {
		Animal a = new Tijger();
		a.setLegs(12);
		a.setName("LegsMania");
		a.setType("Weird");
		a.makeSound();
		
		Cat c = new Cat();
		c.setLegs(4);
		c.setName("Cat");
		c.setType("Main Coon");
		c.makeSound();
		
		Snake s = new Snake();
		s.setLegs(0);
		s.setName("Snake");
		s.setType("Cobra");
		s.setLengte(50);
		s.makeSound();
		
		Animal k = new Kikker();
		k.setLegs(4);
		k.setName("Frog");
		k.setType("Red-eyed tree frog");
		k.makeSound();
		
		// 3 dieren aanmakenen vullen met de setters
	}
	
}
