package pets;

public interface Pet {
	
	public String getName();
	
	public int getAge();
	
	public void addFriend(Pet newFriend);
	
	public Pet[] getAllFriends();
	
	public String sayHello(); 
}
