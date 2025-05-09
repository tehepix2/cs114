package pets;

import java.util.ArrayList;

public class Cat implements Pet{

	private String name;
	private int age;
	private ArrayList<Pet> myFriends = new ArrayList<>();
	
	public Cat(String name, int age) {
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
		return "meow";
	}
	
	@Override
	public String toString() {
		return name + " the Cat";
	}
	
}
