package uuidRandomString;
import java.util.UUID;

public class UUIDRandomString {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println("uuid = " + uuid);
	}
}
