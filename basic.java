//basic java program 

public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
		int giraffesInZoo = 4;
		int animalsInZoo = zebrasInZoo + giraffesInZoo;
		int numZebrasAfterTrade = zebrasInZoo - 2;
	
		double subtotal = 30;
		double tax = 0.0875;
		double total = subtotal + (subtotal*tax);
		double perPerson = total/4;
	
		int students = 26;
		int leftOut = students%3;
	
		double creditsEarned = 176.5;
		double creditsOfSeminar = 8;
		double creditsToGraduate = 180;
		boolean check = creditsEarned > creditsToGraduate;
		double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
		
		int songsA = 9;
		int songsB = 9;
		int albumLengthA = 41;
		int albumLengthB = 53;
		boolean sameNumberOfSongs = songsA == songsB;
		boolean differentLength = albumLengthA != albumLengthB;
		
		double recommendedWaterIntake = 8;
		double daysInChallenge = 30;
		double yourWaterIntake = 235.5;
		double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
		boolean isChallengeComplete =  yourWaterIntake >= totalRecommendedAmount;
	
		System.out.println(animalsInZoo);
		System.out.println(numZebrasAfterTrade);
	
		System.out.println(total);
		System.out.println(perPerson);
	
		System.out.println(leftOut);
	
	//it will directly give boolean values even after not declaring it
		System.out.println(check);
		System.out.println(creditsToGraduate < creditsAfterSeminar);
		
		System.out.println(isChallengeComplete);
	}
}