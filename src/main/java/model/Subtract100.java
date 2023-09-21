package model;

public class Subtract100 {
	private int usersNumber;
	
	public Subtract100() {
		super();
	}
	
	public Subtract100(int usersNumber) {
		super();
		this.usersNumber = usersNumber;
		
	}

	public int getUsersNumber() {
		return usersNumber;
	}

	public void setUsersNumber(int usersNumber) {
		this.usersNumber = usersNumber - 100;
	}
	
	@Override
	public String toString() {
		return "Your number subtracted by 100 equals = " + usersNumber;
	}
}
