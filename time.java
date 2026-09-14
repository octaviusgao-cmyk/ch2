public class time {
	
	public static void main (String[] args) {
		int hour = 13;
		int minute = 16;
		int second = 41;
		
		double current = hour*60*60 + minute*60 + second;
		double total = 60*60*24;
		
		System.out.print(hour*60*60 + minute*60 + second);
		System.out.println(" seconds passed from midnight");
		
		System.out.print(60*60*24 - hour*60*60 + minute*60 + second);
		System.out.println(" seconds remaining in the day");
		
		System.out.print(current/total*100);
		System.out.println(" percent done with the day");
	}
}
