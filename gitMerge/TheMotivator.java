package gitMerge;

public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
<<<<<<< HEAD
		else if (score > 50){
			System.out.println("You can do better.");
=======
		else if ( score < 30){
			System.out.println("You can suck less than that.");
>>>>>>> newBranch
		}else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
<<<<<<< HEAD
		tm.feedback(60);
=======
		tm.feedback(20);
>>>>>>> newBranch
	}

}
