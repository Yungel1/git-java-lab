public class Participants {

    public static void main(String[] args) {
        System.out.println("=== OFFICIAL PARTICIPANTS LIST ===");
        
        // INSTRUCTIONS: Add your name and GitHub username below 
        // using the greet() method.
	//
        
        greet("Adrian", "Yungel1");
        greet("Mikel", "Midoiaga");
    }

    public static void greet(String name, String githubUser) {
        System.out.println("Hello! I'm " + name + " (GitHub: @" + githubUser + ")");
    }
}
