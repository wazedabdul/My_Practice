package loops;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for (int i = 1; i<5; i++) {
			int j=1;
			while (j<3) {
				for (int x=1; x<6;x++) {
					System.out.println("value I "+i+ "value j "+j + "value x "+x);
					count++;
				}
				j++;
			}
		System.out.println(count);
		}
	}

}
