package Assignment1;

public class Average_And_Percentage {

	public static void main(String[] args) {
		int English = 80, Math = 90, History = 88, Science = 74, ICT = 95, Total, Average, Percentage;
		Total = (English + Math + History + Science + ICT);
		System.out.println("Total Marks  " + Total);
		Average = (English + Math + History + Science + ICT) / 5;
		System.out.println("Average Marks  " + Average);
		Percentage = Average*100/100; // values are out of 100 so expect same
		System.out.println("Percentage   " +Percentage);																		// average and percentage values will be
																				// same
		
		
		
	}

}
