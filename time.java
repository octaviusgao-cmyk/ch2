public class time {
	
	public static void main (String[] args) {
		int hour = 13;
		int minute = 16;
		int second = 41;
		
		System.out.print(hour*60*60 + minute*60 + second);
		System.out.println(" seconds passed from midnight");
		
		System.out.print(60*60*24 - hour*60*60 + minute*60 + second);
		System.out.println(" seconds remaining in the day");
	}
}
