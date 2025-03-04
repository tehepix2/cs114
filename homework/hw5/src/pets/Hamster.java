package pets;

import java.util.ArrayList;

public class Hamster implements Pet, Trainable {
    private String name;
    private int age;
    private ArrayList<Pet> myFriends = new ArrayList<>();

    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return this.name;
    }
	@Override
	public int getAge() {
        return this.age;
    }
	@Override
	public void addFriend(Pet newFriend) {
        this.myFriends.add(newFriend);
    }
	@Override
	public Pet[] getAllFriends() {
        return myFriends.toArray(new Pet[myFriends.size()]);
    }
	@Override
	public String sayHello() {
        return "squeak squeak";
    }
    @Override
	public String toString() {
		return name + " the Hamster";
	}
    @Override
	public String doTrick() {
		return name + " is out of the maze!";
	}
}
