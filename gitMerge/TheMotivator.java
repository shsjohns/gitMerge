package gitMerge;

public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else if (score > 50)
			System.out.println("You can do better.");
		else if (score > 40)
			System.out.println("Stuffy stuff");
		else if ( score < 0){
			System.out.println("You can't have a negative score");
		}else if(score < 30){
			System.out.println("You can suck less than that.");
		}else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
		tm.feedback(-10);
	}

}
