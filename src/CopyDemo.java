
public class CopyDemo {

	public static void main(String[] args) {
		int original = 26;
		int target = original;
		System.out.println("original's value = " + original);
		System.out.println("target's value = " + target);

		original = 36;
		System.out.println("original's value = " + original);
		System.out.println("target's value = " + target);
	}
}
