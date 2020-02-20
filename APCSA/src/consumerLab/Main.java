package consumerLab;
import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt
	/*try {
		Scanner input = new Scanner(new File("src/consumerLab/positiveAdjectives.txt"));
		while(input.hasNextLine()){
			String temp = input.nextLine().trim();
			System.out.println(temp);
		}
		
		input.close();
	}
	catch(Exception e){
		System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
	}*/
	

	/*System.out.println(Review.textToString("src/consumerLab/simpleReview.txt"));
	System.out.println(Review.totalSentiment("src/consumerLab/simpleReview.txt"));
	System.out.println(Review.starRating("src/consumerLab/simpleReview.txt"));
	System.out.println(Review.totalSentiment("src/consumerLab/26WestReview.txt"));
	System.out.println(Review.starRating("src/consumerLab/26WestReview.txt"));*/
	System.out.println(Review.fakeReview("src/consumerLab/simpleReview.txt"), "positive");
	System.out.println(Review.fakeReview("src/consumerLab/simpleReview.txt"), "negative");
	System.out.println(Review.fakeReview("src/consumerLab/simpleReview.txt"), "random");
  }
}
