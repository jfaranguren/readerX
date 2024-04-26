package model;

public class Controller {

	private User[] users;

	public Controller() {

		users = new User[10];
		testCases();

	}

	public void testCases() {

		users[0] = new User("1234", "John Smith", "Smithy");
		users[1] = new User("5678", "Pocahontas", "Pocah");
	}

	public String getUserList() {

		String msg = "";

		for (int i = 0; i < users.length; i++) {

			if (users[i] != null) {
				msg += "\n" + (i + 1) + ". " + users[i].getId() + " - " + users[i].getName();
			}

		}

		return msg;

	}

	public boolean registerUser(String id, String name, String nickname) {

		return false;
	}

	public boolean editUser(int userPosition) {

		return false;
	}

	public boolean deleteUser(int userPosition) {

		return false;
	}

	public String getUserInfo(int option) {

		String msg = "";

		return msg;
	}

	public String getAllUserInfo() {

		String msg = "";

		return msg;
	}

}
