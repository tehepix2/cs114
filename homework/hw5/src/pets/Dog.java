package pets;

import java.util.ArrayList;

public class Dog implements Pet, Trainable{

	private String name;
	private int age;
	private ArrayList<Pet> myFriends = new ArrayList<>();
	
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void addFriend(Pet newFriend) {
		myFriends.add(newFriend);	
	}

	@Override
	public Pet[] getAllFriends() {
		return myFriends.toArray(new Pet[myFriends.size()]);
	}

	@Override
	public String sayHello() {
		return "woof woof";
	}

	@Override
	public String toString() {
		return name + " the Dog";
	}
	@Override
	public String doTrick() {
		return name + " is fetching the ball!";
	}

}
