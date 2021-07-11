public class Assignment2 {
	public static void main(String[] args) {
		
		int numberOfBalls = 30;
		int currentScore, totalRuns = 0;
		int count[] = new int [7];
		double strikeRate;
		
		for(int i=0; i <numberOfBalls; i++) {
			currentScore = (int)(Math.random()*7);
			//System.out.print(runs[i] + " \t ");
			totalRuns = totalRuns + currentScore;
			count[currentScore]+=1;		
		}
		
		System.out.println("Total Runs made by player : "+totalRuns);
		
		for(int i=0; i<count.length;i++) {
			System.out.println("No. of "+i +"'s : " +count[i]);
		}
		
		strikeRate = totalRuns / numberOfBalls * 100;
		
		System.out.println("Strike Rate made by player : "+strikeRate);
	}

}
