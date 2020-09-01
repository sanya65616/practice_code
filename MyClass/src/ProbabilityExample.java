import java.util.Random;

public class ProbabilityExample {
	
	public static void main(String[] args) {
		float percent = 0.85f;
		int successCount = 0;
		int failureCount = 0;
		Random random = new Random();
		for(int i=0; i<100; i++) {
			if(random.nextFloat() <= percent) {
				System.out.println("Success");
				successCount++;
			}
			else {
				System.out.println("Failure");
				failureCount++;
			}
		}
		System.out.println("Success Count: " + successCount + ", Failure Count: " + failureCount);
	}

}
