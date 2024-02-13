public class Main {
	public static void main(String[] args)
	{
		Telivision tv = new Telivision("Sangsung", "A11");
		tv.decreaseChannel();
		System.out.println(tv.getChannel());
	}
}