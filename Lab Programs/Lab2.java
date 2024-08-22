class Animal
{
	void createSound()
	{
		System.out.print("All animals make sounds.\n");
	}
}
class Dog extends Animal
{
	void createSound()
	{
		super.createSound();
		System.out.print("Dogs bark to produce the sound bow bow.");
	}
} 

class Solution
{
	public static void main (String args[])
	{
		Animal a = new Animal();
		Dog d = new Dog();
		//a.createSound();
		d.createSound();
	}
}