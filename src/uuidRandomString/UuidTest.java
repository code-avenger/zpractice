package uuidRandomString;
import java.util.UUID;

public class UuidTest {
	public static void main(String[] args) {
		// creating UUID
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		// checking UUID value
		System.out.println("UUID value is: " + uid);
	}
}
